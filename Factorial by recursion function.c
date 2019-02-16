#include<stdio.h>
int dp[100];
long int factorial(long int n)
{
if(n<=1)
return 1;
if(dp[n]!=-1)
return dp[n];
else
 dp[n]=n*factorial(n-1);
return dp[n];
}
void main()
{
int i;
long int x,n;
scanf("%d",&n);
for(i=0;i<n;i++)
dp[i]=-1;
x=factorial(n);
printf("%d",x);
}




