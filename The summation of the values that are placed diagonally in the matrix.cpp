#include<stdio.h>
int main()
{
int a[100][100],b[100][100],i,j,sum=0,h=0,m,n;
scanf("%d %d",&m,&n);
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
scanf("%d",&a[i][j]);
}
}

for(i=0;i<m;i++)
{
sum+=a[i][i];
}
for(i=0,j=n-1;i<n;i++,j--)
{
h+=a[i][j];
}
printf("%d %d",sum,h);
return 0;
}


