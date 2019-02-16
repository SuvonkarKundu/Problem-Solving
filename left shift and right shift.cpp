#include<stdio.h>
main()
{
    unsigned int i;
    int j;
    i=1;
    for(j=0;j<4;j++)
    {
        i=i<<1;
        printf("Left shift %d= %d\n",j,i);
    }
     for(j=0;j<4;j++)
    {
        i=i>>1;
        printf("Left shift %d= %d\n",j,i);
    }
  return 0;
}














