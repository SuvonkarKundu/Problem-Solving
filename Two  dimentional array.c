#include<stdio.h>
int main()
{
int twod[100][100],i,j,n,m;
scanf("%d %d",&n,&m);
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
twod[i][j]=i*j;
}
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
printf("%2d",twod[i][j]);
}
printf("\n");
}
return 0;
}





