#include<stdio.h>
long int factorial(long int n)
{
long int i,result;
result=1;
for(i=2;i<=n;i++)
{
result*=i;
}
return (result);
}
void main()
{
long int value,n;
scanf("%d",&n);
value=factorial(n);
printf("%ld",value);
}















