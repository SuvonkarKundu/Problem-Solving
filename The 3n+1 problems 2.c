#include<stdio.h>
void main()
{
int a,b,count,i,j;
scanf("%d %d",&a,&b);
for(i=1;i<=b;i++)
{
count=0;
for(j=i;j<=i;j++)
{
if((j%2==0))
j=(3*j+1);
else
j=j/2;
count++;
}
printf("%d",count);
}

}










