#include<iostream>
using namespace std;
main()
{
    int a,b,c,n,h;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        cin>>a>>b>>c;
        h=a+b;
        if(h>c)
        {
            cout<<"OK"<<"\n";
        }
        else
        {
            cout<<"Wrong!!"<<"\n";
        }
    }
return 0;
}
