#include<stdio.h>
main()
{
    long int N,h;
    while(scanf("%ld",&N)!=EOF)
    {
        if(N==0)
        break;
        if(N<=100)
        {
            printf("f91(%ld) = 91",N);
        }
         else{

            h=N-10;
            printf("f91(%ld) = %ld",N,h);

         }
         printf("\n");
    }
return 0;
}









