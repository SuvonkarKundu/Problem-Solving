#include<stdio.h>
void main()
{
int n;
scanf("%d",&n);
do
{
if((n%2!=0))
n=(3*n+1);
else
n=n/2;
printf("%d\n",n);
}
while(n!=1);
}








