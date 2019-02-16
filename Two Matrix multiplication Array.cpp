#include<stdio.h>
int main()
{
int a[100][100],b[100][100],c[100][100],i,j,k,m,n;
scanf("%d %d",&n,&m);
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
scanf("%d",&a[i][j]);
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
scanf("%d",&b[i][j]);
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=0;
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
for(k=0;k<m;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
printf(" %d",c[i][j]);
}
printf("\n");
}
return 0;
}









