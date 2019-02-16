#include<stdio.h>
int main()
{
    int i,j,k,l,p,t,n,max;
    while(scanf("%d%d",&i,&j)!=EOF)
    {
        max=0;
        if(i>=j)
        {
            k=i;
            l=j;
        }
        else
        {
            k=j;
            l=i;
        }
        for(t=l;t<=k;t++)
        {
            n=t;
            p=0;
            while(n>=1)
             {
                p++;
                if(n==1)
                break;
                if(n%2!=0)
                n=3*n+1;
                else
                n=n/2;

              }
        if(p>max)
          max=p;
        }
   printf("%d %d %d\n",i,j,max);
    }
    return 0;
}




















