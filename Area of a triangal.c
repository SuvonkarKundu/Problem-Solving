#include<stdio.h>
#include<math.h>
float area(float a,float b,float c)
{
float s,A;
s=(a+b+c)/2;
A=sqrt(s*(s-a)*(s-b)*(s-c));
return(A);
}
main()
{
float y,a,b,c;
scanf("%f %f %f",&a,&b,&c);
y=area(a,b,c);
printf("%f",y);
}








