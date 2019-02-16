#include<stdio.h>
long int prime(long int n)
{
long int i;
for(i=2;i<n;i++)
{
if(n%i==0)
return 1;
}
return 0;
}
int arr[1000]
main()
{
long int n,y,i,j,t;
scanf("%d",&n);
y=prime(n);
i=0;
if(y==1)
{
    while(n!=0)
    {
        arr[i]=n%10;
        n=n/10;
        i++;

    }
for(j=0;j<i;j++)
{
    if(t<arr[j])

}

{

}
  printf("NOT PRIME NUMBER %d",y);
}

if(y==0)
printf("THE PRIME NUMBER ");
}


















