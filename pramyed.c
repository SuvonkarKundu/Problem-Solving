#include<stdio.h>
void main()
{
int i,j,n,m;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
for(j=1;j<=(n-i);j++)
{
printf(" ");
}
m=i;
for(j=1;j<=i;j++)
{
printf("%d",m++);
}
m=m-2;
for(j=1;j<i;j++)
{
printf("%d",m--);
}
printf("\n");
}
}













