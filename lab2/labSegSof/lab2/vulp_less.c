    /*  vulp.c  */

    #include <stdio.h>
    #include <unistd.h>


    int main()
    {
       char * fn = "/tmp/XYZ";
       char buffer[60];
       FILE *fp;

       /* get user input */
       scanf("%50s", buffer );

       if(!access(fn, W_OK)){
	    if(seteuid(getuid()) || setegid(getgid())){
                printf("Failed to switch to unprivileged mode");
		return -1;
	    }
            //Do stuff with launching user privileges only...
	    fp = fopen(fn, "a+");
            fwrite("\n", sizeof(char), 1, fp);
            fwrite(buffer, sizeof(char), strlen(buffer), fp);
            fclose(fp);
	    
	    if(seteuid(0) || setegid(0)){
                printf("Failed to switch back to privileged mode");
		return -1;
	    }
	    //Do privileged stuff...
       }
       else printf("No permission \n");
    }
