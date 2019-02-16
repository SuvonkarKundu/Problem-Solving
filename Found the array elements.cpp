#include<stdio.h>
 main()
{
int a[100],b,n,i;
scanf("%d",&n);
scanf("%d",&b);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
	if(a[i]!=b)
    continue;
    if(a[i]==b)
printf("Found");
break;
}
if(a[i]!=b)
printf("Not Found");
}


