#include<iostream>
using namespace std;
main()
{
    int tc,sum,w,y,c,v,r;
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        sum=0;
        cin>>w;
        for(int j=1;j<=w;j++)
        {
            cin>>y>>c>>v;
            r=y*v;
            sum+=r;
        }
        cout<<sum<<"\n";
    }
return 0;
}
