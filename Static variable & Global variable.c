#include<stdio.h>
int a=100, b=200;
int funct1(int count);
int funct2(int c);
main()
{
int count;
for(count=1;count<=5;++count)
printf("% d",funct1(count));
}
funct1(int x)
{
int c,d;
c= funct2(x);
d=(c<100)?(a+c):b;
return(d);
}
funct2(int x)
{
static int prod=1;
prod*=x;
return(prod);
}









