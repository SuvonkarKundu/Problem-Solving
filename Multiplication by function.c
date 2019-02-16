#include<stdio.h>
long int mult(int a,int b)
{
long int c;
c=a*b;
return (c);
}
main()
{
long int y,a,b;
scanf("%d %d",&a,&b);
y=mult(a,b);
printf("%ld",y);
}




