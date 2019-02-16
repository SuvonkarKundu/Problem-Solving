#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j,m,n;
	int a[50][50];
	
	scanf("%d %d",&m,&n);
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
			printf("%d ",a[i][j]);
		}
	}
}
