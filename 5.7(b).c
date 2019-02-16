#include<stdio.h>
void main()
{
int n,i,h,j;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
for(j=0;j<i;j++)
{
h=(i+j)%2;
printf("%2d",h);
}
printf("\n");
}
}









