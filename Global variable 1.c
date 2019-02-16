#include<stdio.h>
int a=100,b=200;
int funct1(int a,int b);
 main()
{
int count,c,d;
for(count=1;count<=5;++count)
{
c=20*(count-1);
d=4*count*count;
printf("%3d %3d",funct1(a,c),funct1(b,d));
}
}
funct1(int x,int y)
{
return(x-y);
}












