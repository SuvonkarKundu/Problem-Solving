#include<stdio.h>
void main()
{
int i,j,n,h;
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=1;j<=(i+1);j++)
{
h=i+1;
printf("%2d",h);
}
printf("\n");
}
}









