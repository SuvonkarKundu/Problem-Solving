#include<stdio.h>
int main()
{
  long int tc,a,b,c,d,i;
  scanf("%ld",&tc);
  for(i=1;i=tc;i++)
  {
      scanf("%ld %ld %ld %ld",&a,&b,&c,&d);
      if(a+b>c&&a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d)
        printf("quadrangle \n");
      else if(a==c&&b==d&&a!=d&&b!=c)
        printf("rectangle \n");
      else if(a==b&&a==c&&a==d&&b==c&&b==d&&d==c)
        printf("square \n");
      else
        printf("banana \n");
  }
return 0;
}
