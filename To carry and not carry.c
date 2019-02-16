#include<stdio.h>
main()
{
  unsigned long int q,w;
    while(scanf("%lu%lu",&q,&w)!=EOF)
    {
       printf("%lu\n",q^w);

    }
return 0;
}
