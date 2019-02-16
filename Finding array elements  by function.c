#include<stdio.h>
int search(int a[100],int b)
{
int i;
for(i=0;i<5;i++)
{
if(a[i]==b)
return i;
}
if(i==5)
return (-1);
}
void main()
{
int j,x,b,a[100];

for(j=0;j<10;j++)
scanf("%d",&a[j]);
scanf("%d",&b);
x=search(a,b);
if(x==-1)
printf("not found");
else
printf("found in position %d",x);
}










