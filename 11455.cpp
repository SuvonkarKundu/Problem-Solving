#include<stdio.h>
 main()
{
    long int a,b,c,d,n,i;
    scanf("%ld",&n);
    for(i=1;i<=n;i++)
    {
       scanf("%ld %ld %ld %ld",&a,&b,&c,&d);

             if(a+b>c&&b+c>a&&c+a>b&&a!=c&&b!=d&&a!=b)
             printf("quadrangle\n");
              if(a==c&&b==d&&b!=c&&a!=d)
             printf("rectangle\n");
             if(a==b&&c==d&&b==c&&a==d&&a==c&&b==d)
             printf("square\n");
             if(a+b<c||b+c<a||c+a<b)
             printf("banana\n");
    }
  return 0;
}















