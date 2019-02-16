#include<stdio.h>
int a=3;
int funct1(int count);
main()
{
int count;
for(count=1;count<=5;++count)
{
a=funct1(count);
printf("%4d",a);
}
}
funct1(int x)
{
a+=x;
return(a);
}






