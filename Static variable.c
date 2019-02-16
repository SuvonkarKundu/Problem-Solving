#include<stdio.h>
int funct1(int count);
main()
{
int a,count;
for(count=1;count<=5;++count)
{
a=funct1(count);
printf("%3d",a);
}
}
funct1(int x)
{
static int y=0;
y+=x;
return(y);
}






