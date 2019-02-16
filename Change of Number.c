#include<stdio.h>
void main()
{
int n,k=0,a[100],sum=0,i=0,j;
scanf("%d",&n);
while(n!=0)
{
a[k]=n%10;
n=n/10;
k++;
}
for(j=k-1;j>=0;j--)
{
sum+=a[j]*pow(10,i);
i++;
}
printf("%d",sum);
}











