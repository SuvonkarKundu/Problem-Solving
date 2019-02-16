#include<stdio.h>
int main()
{
    int n,c,t,count;
   while(scanf("%d",&n)==1)
    {
        count=0;
        if(n==0)
        {
             break;
        }
        while(1)
        {
            t=n-3+1;
            n=t;
            if(t<0)
            break;
            count++;
        }
    printf("%d\n",count);
    }
return 0;
}



