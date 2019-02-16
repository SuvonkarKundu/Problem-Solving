#include<iostream>
#include<cmath>
using namespace std;
main()
{
    int a,b,t,c;
    while(1)
    {
      cin>>a>>b;
      if(a==-1&&b==-1)
      {
          break;
      }
       if((a==0&&b==99)||(a==99&&a==0))
       {
           cout<<1<<"\n";
       }
       else
       {
           t=a-b;
           c=fabs(t);
           cout<<c<<"\n";
       }
    }
return 0;
}














