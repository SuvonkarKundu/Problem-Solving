#include<iostream>
#include<cstdio>
using namespace std;
main()
{
    int n,l,w,h;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        cin>>l>>w>>h;
        if(l==w&&l==h)
        {
            printf("Case %d: good\n",i);
        }
        else
        {
            printf("Case %d: bad\n",i);
        }
    }
return 0;
}














