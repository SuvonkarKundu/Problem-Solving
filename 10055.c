#include<stdio.h>
void main()
{
long int a,b,h;
while(scanf("%ld %ld",&a,&b)!=EOF)
{
if(a>b)
h=a-b;
else
h=b-a;
printf("%ld\n",h);
}
}







