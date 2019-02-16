#include<stdio.h>
int main()
{
   long int v=3,n,c=0,h,t,count;
   while(1)
   {
       scanf("%ld",n);
       t=n+c;
       count=0;
       while(1)
       {
         h=t-v+1;
          t=h;
          if(t<=0)
            break;
          count++;
       }
       printf("%ld",count);
   }
 return 0;
}












