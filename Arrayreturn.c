#include<stdio.h>
int a[1000],j;
int returnarray(int x, int contaner[])
{   int count=0;
    for(j=0;j<x;j++)
    {
        contaner[j]= count++;
    }


}
int main()
{
    int i,number;
    scanf("%d",& number);
    for(i=0;i<number;i++)
    {
        scanf("%d",&a[i]);
    }
    returnarray(number,a);

     for( i=0;i<number;i++)
    {
        printf("%d",a[i]);
    }


}
