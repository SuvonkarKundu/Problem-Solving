#include<stdio.h>
void main()
{
int a[100][100],b[100][100],c[100][100],i,j,sum=0,h=0,m,n;
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
for(j=0;j<n;j++)
{
scanf("%d",&b[i][j]);
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=0;
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
c[i][j]+=a[i][j]+b[i][j];
printf("%2d",c[i][j]);
}
printf("\n");
}
}





