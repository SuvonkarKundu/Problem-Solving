#include<iostream>
using namespace std;
int fibonacce(int n);
int dp[5];
int main()
{
    int n,receive_value;
    for(int i=0;i<20;i++)
       dp[i]=-1;
       cin>>n;
       receive_value= fibonacce(n);

        if(receive_value==0&&receive_value==1)
        {
            cout<<receive_value;
        }

      else
      {
         for(int j=0;j<5;j++)
         cout<<dp[j]<<"\n";
      }



}
int fibonacce(int n)
{
   if(n==0)
    return 0;
   if(n==1)
    return 1;
   if(dp[n]!=-1)
    return dp[n];
   else
   {
       dp[n]=fibonacce(n-1)+fibonacce(n-2);
       return dp[n];
   }

}
