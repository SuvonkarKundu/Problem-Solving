#include<stdio.h>
void main()
{
int i,n,j,a[100],t;
scanf("%d",&n);
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j+1];
a[j+1]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n;i++)
printf("%d",a[i]);
}









