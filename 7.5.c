#include<stdio.h>
void main()
{
long int Roll[100],Sub[50],i,j,sum=0,n,h;
scanf("%ld %ld",&n,&h);
for(i=0;i<n;i++)
{
scanf("%ld",Roll[i]);
}
for(j=0;j<h;j++)
{
scanf("%ld",&Sub[j]);
}
for(i=0;i<n;i++)
{
for(j=0;j<h;j++)
{
sum+=Sub[j];
}
}
printf("%ld",sum);
}









