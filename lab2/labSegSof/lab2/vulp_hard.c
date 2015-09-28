    /*  vulp_hard.c  */

    #include <stdio.h>
    #include <unistd.h>
    #include <sys/stat.h>

    int main()
    {
       char * fn = "/tmp/XYZ";
       char buffer[60];
       FILE *fp;
       struct stat fs;
       ino_t inode;

       /* get user input */
       scanf("%50s", buffer );

       stat(fn, &fs);
       inode = fs.st_ino;
       if(!access(fn, W_OK)){
	    //The link would have to be changed now
            fp = fopen(fn, "a+");
	    //And then back to the original file now
            stat(fn, &fs);
            if(fs.st_ino == inode){
                fwrite("\n", sizeof(char), 1, fp);
                fwrite(buffer, sizeof(char), strlen(buffer), fp);
                fclose(fp);
	    }else
                printf("Aborting: Sneaky stuff detected!!\n");
       }
       else printf("No permission \n");
    }
