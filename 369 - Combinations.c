#include<stdio.h>
main()
{
    long int t,y,c,q,w,e;
    int i,j,k;
    while(1)
    {
        scanf("%ld %ld",&t,&y);
        q=t-y;

        if(t==0&&y==0)
        {
            break;
        }
        for(i=1;i<t;i++)
        {
           t=t*i;
        }
        for(j=1;j<=y;j++)
        {
            y=y*j;
        }
        for(k=1;k<=q;k++)
        {
            q=q*k;
        }
        e=y*q;
        c=t/e;
    printf("%ld things taken %ld at a time is %ld exactly.\n",t,y,c);


    }



}
















