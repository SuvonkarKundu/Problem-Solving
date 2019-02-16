#include<stdio.h>
void main()
{
    int n,sum=0,i,a[100],j=0,l;

   while(l>0)
  {

    while(l!=0)
    {
        a[j]=l%10;
        l=l/10;
        j++;
    }
for(i=j-1;i>=0;i--)
{
    sum+=pow(a[i],3);
}
  if(l==sum)
  {
      printf("%d",l);
  }

}
}


