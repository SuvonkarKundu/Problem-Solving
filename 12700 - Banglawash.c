#include<iostream>
#include<cstdio>
using namespace std;
main()
{
    char str[100];
    int n,tc,count,q,r
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {   count=0;
         q=0;
         r=0;
        cin>>n;
        cin(str);
        for(int j=0;j<n;j++)
        {
            if(str[j]=='B')
            {
                count++
            }
            if(str[j]=='W')
            {
                q++;
            }
            if(str[j]=='A')
            {
                r++;
            }
        }
         if(count==n)
         {
            printf("Case %d: BANGLAWASH",i);
         }
         else if(q==n)
         {
             printf("Case %d: WHITEWASH",i);
         }
        else if(r==n)
          {
              printf("Case %d: ABANDONED",i);
          }
         else if(count==q)
          {
              printf("Case %d: DRAW %d %d",i,count,q);
          }
           else if((count+r)==n)
         {
              printf("Case %d: BANGLAWASH",i);
         }
          else if((count+q)==n)
         {
             printf("Case %d: WHITEWASH",i);
         }
          else
          {
              if(count>q)
              {
                  printf("Case %d: BANGLADESH %d - %d",i,count,q);
              }
              else
              {
                  printf("Case %d: WWW %d - %d",i,q,count);
             }
    }
    }
 return 0;
}
















