#include<iostream>
using namespace std;
int main()
{
   long int tc,n,t,row;
   cin>>tc;
   for(int i=1;i<=tc;i++)
   {
       t=0;
       row=0;
       cin>>n;
       for(int j=1;j<=n;j++)
       {
           t=t+j;
           if(t<=n)
           {
               row++;
           }
           else if(t>n)
           {
               break;
           }
       }
   cout<<row<<"\n";
   }
  return 0;
}














