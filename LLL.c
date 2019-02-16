#include<stdio.h>
void main()
{
int i,j,k,X=0;
for(i=0;i<5;++i)
{
for(j=0;j<i;++j)
{
switch(i+j-1)
{
case -1:
case 0:
X+=1;
break;
case 1:
case 2:
case 3:
X+=2;
default:
X+=3;
}
printf("%d",X);
}
printf("\nX=%d",X);
}
}







