#include<stdio.h>
int main()
{
    long int a,b,c,d,n,i;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
       scanf("%d %d %d %d",&a,&b,&c,&d);


        if(a==0&&b==0&&c==0,d==0)
        break;
        else
        {
             if(a*a==(b*b+d*d))
             printf("quadrangle\n");
             else if(a==c&&b==d&&b!=c&&a!=d)
             printf("rectangle\n");
             else if(a==b&&c==d&&b==c&&a==d)
             printf("square\n");
             else
             printf("banana\n");


        }



    }


  return 0;



}



























