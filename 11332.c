#include<stdio.h>
void main()
{
long long int n,sum=0,h;
while(1)
{
scanf("%lld",&n);
if(n==0)
break;

while(n>9)
{
sum=0;
while(n!=0)
{
h=n%10;
n=n/10;
sum+=h;
}
n=sum;
}
printf("%lld\n",n);
}
}











