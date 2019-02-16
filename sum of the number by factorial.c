#include<stdio.h>

int sum(int n)
{
    if(n==0||n==1)
    {
        return 1;
    }
    else
    return(sum(n-1)+n);
}
main()
{
  int number,result;
  scanf("%d",&number);
  result=sum(number);
  printf("%d",result);
}
