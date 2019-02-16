#include<iostream>
using namespace std;
main()
{
   long int n,t,q,x,y;
   while(1)
   {
   cin>>n;
   if(n==0)
   {
   break;
   }
   cin>>t>>q;
   for(int i=1;i<=n;i++)
   {
       cin>>x>>y;
       if(t==x||q==y)
       {
           cout<<"divisa"<<"\n";
       }
       else if(x>t&&y>q)
       {
           cout<<"NE"<<"\n";
       }
        else if(x<t&&y>q)
        {
            cout<<"NO"<<"\n";
        }
        else if(x>t&&y<q)
        {
            cout<<"SE"<<"\n";
        }
        else if(x<t&&y<q)
        {
            cout<<"SO"<<"\n";
        }
   }
   }
return 0;
}
