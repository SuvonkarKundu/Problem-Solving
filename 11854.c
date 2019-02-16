#include<stdio.h>
#include<math.h>
int main()
{
   long int a,b,c,h,t;
    while(1)
    {
  scanf("%ld %ld %ld",&a,&b,&c);

    if(a==0&&b==0&&c==0)
    break;
      if((pow(a,2)==pow(b,2)+pow(c,2))||(pow(b,2)==pow(a,2)+pow(c,2))||(pow(c,2)==pow(a,2)+pow(b,2)))
      {
          printf("right\n");
      }
      else
      {

        printf("wrong\n");
      }
}
return 0;
}

