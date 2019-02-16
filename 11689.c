#include<stdio.h>
int main()
{
    int tc,e,f,c,l,t,count,i;
    scanf("%d",&tc);
    for(i=1;i<=tc;i++)
    {
        count=0;
        scanf("%d %d %d",&e,&f,&c);
        l=e+f;
        while(1)
        {

            t=l-c+1;
            l=t;
            if(l<=0)
            break;
            count++;

        }
        printf("%d\n",count);
    }
return 0;

}


















