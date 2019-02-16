#include<stdio.h>
#include<math.h>
int main()
{
   int a,b,c,h,t;
    while(1)
{
  scanf("%d %d %d",&a,&b,&c);
    
    if(a==0&&b==0&&c==0)
    break;
    if(a>b&&a>c)
    {
      h=a;
      if(pow(h,2)==pow(b,2)+pow(c,2))
      {
          printf("right");
      }
      else
        printf("wrong");
    }
     else if(b>a&&b>c)
     {
         t=b;

        if(pow(t,2)==pow(a,2)+pow(c,2))
      {
          printf("right");
      }
      else
        printf("wrong");

     }
  else
  {
        if(pow(c,2)==pow(a,2)+pow(b,2))
      {
          printf("right");
      }
      else
        printf("wrong");

  }

}

return 0;
}


