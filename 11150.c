#include<stdio.h>
int main()
{
  long  int N,v=3,count,i,result,h;
    while (1)
    {
    scanf("%ld",&N);
count=0;
        h=N;
        while(1)
        {
           if(N%3==0)
           {
           i=N-v+1;
           N=i;
           if(N<=1)
            break;
           count++;
           }
           else
           {
               N=N+1;
               i=N-v+1;
               N=i;
               if(N<=1)
                break;
               count++;
           }
        }
        result=h+count;

        printf("%ld\n",result);


    }
return 0;

}









