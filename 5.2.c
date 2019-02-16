#include<stdio.h>
void main()
{
int n,i,sum=0;
scanf("%d",&n);
for(i=100;i<n;i++)
{
if(i%7==0)
{
sum=sum+i;
}
}
printf("%d",sum);
}













