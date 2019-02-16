#include<stdio.h>
int a=100, b=200;
int funct1(int c);
main()
{
int count,c;
for(count=1;count<=5;++count)
{
c=4*count*count;
printf("%4d",funct1(c));
}
}
funct1(int x)
{
int c;
c=(x<50)?(a+x):(b-x);
return(c);
}






