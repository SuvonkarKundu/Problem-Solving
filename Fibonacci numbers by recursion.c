#include<stdio.h>
long int fib(n)
{
if(n<=1)
return 1;
else
return(fib(n-1)+fib(n-2));
}
void main()
{
long int n,x;
scanf("%d",&n);
x=fib(n);
printf("%d",x);
}









