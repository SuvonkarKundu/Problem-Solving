#include<stdio.h>
int funct1(int a);
int funct2(int a);
main()
{
int a=0,b=1,count;
for(count=1;count<=5;++count)
{
b+=funct1(a)+funct2(a);
printf("%3d",b);
}
}
funct1(int a)
{
int b;
b=funct2(a);
return(b);
}
funct2(int a)
{
static int b=1;
b+=1;
return(b+a);
}


