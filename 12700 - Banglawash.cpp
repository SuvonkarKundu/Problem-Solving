#include<iostream>
#include<cstring>
#include<cstdio>
using namespace std;
main()
{
    char str[110];
    int n,tc,count,q,r,ttt;
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {   count=0;
         q=0;
         r=0;
         ttt=0;
        cin>>n;
        getchar();
        cin>>str;
        for(int j=0;j<n;j++)
        {
            if(str[j]=='B')
            {
                count++;
            }
            if(str[j]=='W')
            {
                q++;
            }
            if(str[j]=='A')
            {
                r++;
            }
            if(str[j]=='T')
            {
               ttt++;
            }
        }
         if(count==n)
         {
            printf("Case %d: BANGLAWASH\n",i);
         }
         else if(q==n)
         {
             printf("Case %d: WHITEWASH\n",i);
         }
        else if(r==n)
          {
              printf("Case %d: ABANDONED\n",i);
          }
         else if(count==q)
          {
              printf("Case %d: DRAW %d %d\n",i,count,ttt);
          }
           else if((count+r)==n)
         {
              printf("Case %d: BANGLAWASH\n",i);
         }
          else if((q+r)==n)
         {
             printf("Case %d: WHITEWASH\n",i);
         }
          else
          {
              if(count>q)
              {
                  printf("Case %d: BANGLADESH %d - %d\n",i,count,q);
              }
              else
              {
                  printf("Case %d: WWW %d - %d\n",i,q,count);
              }
        }
    }
 return 0;
}
















