#include<stdio.h>
void main()
{ int a,b,r,gcd;
scanf("%d%d",&a,&b);
while(r!=0)
{
r=a%b;
a=b;
b=r;
gcd=a;
}
printf("%d",gcd);
}






