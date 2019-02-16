#include<stdio.h>
void main()
{
int n,a[100],k,i=0,j=0,sum=0;
scanf("%d",&n);
while(n!=0)
{
a[i]=n%10;
n=n/10;
i++;
}
for(k=0;k<i;k++)
{
sum+=a[k]*pow(2,j);
j++;
}
printf("%d",sum);
}









