#include<stdio.h>
int interchange (int*a,int*b)
{
int t=*a;
*a=*b;
*b=t;
}
main()
{
int a=5,b=10;
interchange(&a,&b);
printf("%d %d",a,b);
}









