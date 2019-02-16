#include<stdio.h>
int a=0,b=1;
int funct1(int a);
int funct2(int b);
main()
{
int count;
for(count=1;count<=5;++count)
{
b+=funct1(a+1)+1;
printf("%3d",b);
}
}
funct1(int a)
{
int b;
b=funct2(a+1)+1;
return(b);
}
funct2(int a)
{
return(a+1);
}







