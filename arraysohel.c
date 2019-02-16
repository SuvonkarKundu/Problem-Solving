#include<stdio.h>
#include<conio.h>
main()
{
    int a[100][100],b[100][100],c[100][100],i,j,k;
    printf("matrix a is");
    for (i=0;i<3;i++)
    {
        for (j=0;j<3;j++)
        scanf("%3d",&a[i][j]);
    }
        printf("matrix b is");
    for (i=0;i<3;i++)
    {
        for (j=0;j<3;j++)
        scanf("%3d",&b[i][j]);
    }
    for (i=0,j=0;i<3,j<3;i++,j++)
    c[i][j] =a[i] +b[j]

}
