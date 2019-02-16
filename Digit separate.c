#include<stdio.h>
void main()
{
 int n,h,sum=0;
 scanf("%d",&n);
 while(n!=0)
 {
  h=n%10;
 n=n/10;
sum+=h;
 }
 printf("%d",sum);
}








