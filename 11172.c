#include<stdio.h>
void main()
{
int t,i;
long int a,b;
scanf("%d",&t);
for(i=1;i<=t;i++)
{
scanf("%ld %ld",&a,&b);
if(a<b)
printf("<\n");
if(a>b)
printf(">\n");
if(a==b)
printf("=\n");
}
}





