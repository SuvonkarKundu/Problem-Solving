#include<stdio.h>
int dp[100];
main()
{
    int n,q,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        dp[i]=-1;
    }
    q=fabbonaci(n);
    printf("%d",q);
}
int fabbonaci(int n)
{
    if(n==0) return 0;
    if(n==1) return 1;
    if(dp[n]==-1)
    {
        return dp[n];
    }
    else
    {
        dp[n] ==fabbonaci(n-1)+fabbonaci(n-2);
        return dp[n];

    }


}










