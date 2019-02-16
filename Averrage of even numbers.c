#include<stdio.h>
void main()
{
int i,a,b,sum=0,aver,n;
scanf("%d %d",&a,&b);
for(i=a;i<=b;i++)
{
if(i%2!=0)
{
sum+=i;
}
}

printf("%d",sum);
}







