#include<stdio.h>
#include<math.h>
main()
{
    long int t,h,i,j=0,c,q=0,sum=0,tc,array[100];
    scanf("%ld",&tc);
    for(i=1;i<=tc;i++)
    {
        scanf("%ld",&t);
        h=t*t;
        while(h!=0)
        {
             array[j]=h%10;
             h=h/10;
             j++;
             if(array[j-1]!=0)
             {
                 continue;
             }
             for(c=0;c<=j-1;c++)
             {
                 sum+=pow(array[c],2);
             }
               h=sum;
               if(h==t)
               {
                   printf("Case #%ld: %ld is a Happy number",i,t);
                   break;
               }
                if(h==1)
                {
                    printf("Case #%ld: %ld is an UnHappy number",i,t);
                   break;
                }
        }



    }




}
















