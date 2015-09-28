/* race.c  */
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/time.h>
#include<time.h>
#include<errno.h>
#include<string.h>

void check () {
	if ( errno ) {
		perror( strerror ( errno ) );
		exit( EXIT_FAILURE );
	}
}

int main ( int argc, char** argv ) {


	struct timeval timer;
	double zero_time = 0,
               begin_time = 0,
               end_time = 0;
        struct timespec wait_time = {0}, rem = {0};
	int base = 10;
	char *endptr;

	errno = 0;

	/* Record when process starts */
	gettimeofday(&timer, NULL);
	check();
        zero_time = timer.tv_sec + ( timer.tv_usec/1000000.0 );


	/* Validate number of arguments */
        if ( argc != 3) {
		printf( "The program only accept one and only one integer argument." );
		exit( EXIT_FAILURE );
	}	

	/* Convert argument to integer */
        wait_time.tv_sec = strtol( argv[ 1 ], &endptr, base );
	check();

        wait_time.tv_nsec = strtol( argv[ 2 ], &endptr, base ) / 1000000.0;
	check();

	/* Wait argv[ 1 ] seconds */
        nanosleep( &wait_time, &rem );

	/* Record when race-condition began */
	gettimeofday(&timer, NULL);
	check();
        begin_time = timer.tv_sec + ( timer.tv_usec/1000000.0 ) - zero_time;

	/* Race-condition */
	unlink( "/tmp/XYZ" );
	symlink( "/home/seed/Documents/ssof/lab2/dummy2", "/tmp/XYZ" );

	/* Record when race-condition ended */
	gettimeofday(&timer, NULL);
	check();
        end_time = timer.tv_sec + ( timer.tv_usec/1000000.0 ) - zero_time;

	/* Print records */
        printf( "Race-condition timeline after program execution: %.6lfs-%.6lfs\n", begin_time, end_time );

	/* End process successfully */
	exit( EXIT_SUCCESS );

}
