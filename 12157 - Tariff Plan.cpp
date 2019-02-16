#include<iostream>
#include<cstdlib>
#include<cmath>
#include<cstdio>
using namespace std;
main()
{
    long int tc,n,sum,sum1,duration,q,y,r,convertduration;
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        cin>>n;
        sum=0;
        sum1=0;
        for(int j=1;j<=n;j++)
        {
            cin>>duration;
            if(duration%10==0)
            convertduration=duration+1;
            q=ceil((float)convertduration/30);
            q=q*10;
            sum+=q;
            r=ceil((float)convertduration/60);
            r=r*15;
            sum1+=r;
        }
        if(sum<sum1)
        printf("Case %d: Mile %ld\n",i,sum);
        else if(sum1<sum)
        printf("Case %d: Juice %ld\n",i,sum1);
        else
        printf("Case %d: Mile Juice %ld\n",i,sum);
    }
  return 0;
}


















