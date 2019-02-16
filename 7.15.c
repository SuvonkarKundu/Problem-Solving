# include<stdio.h>
void main()
{
 int a[3][3],b[3][3],c[3][3],i,j,t,h;
scanf("%d%d",&t,&h);
for(i=0;i<t;i++)
{
for(j=0;j<h;j++)
{
scanf("%d",&a[i][j]);
}
}
for(i=0;i<t;i++)
{
for(j=0;j<h;j++)
{
scanf("%d",&b[i][j]);
}
}

for(i=0;i<t;i++)
{
for(j=0;j<h;j++)
{
c[i][j]=0;
}
}
for(i=0;i<t;i++)
{
for(j=0;j<h;j++)
{
c[i][j]+=a[i][j]+b[i][j];
printf("  %d",c[i][j]);
}
printf("\n");
}
}








