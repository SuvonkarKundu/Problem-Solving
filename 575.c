#include<stdio.h>
void main()
{
    char array[100];
     int sum=0,i,j,k,n;
    while(scanf("%d ",&n)!=EOF)
    {    i=0;
        while(n!=0)
        {
            array[i]=n%10;
            n=n/10;
            i++;

        }
        k=1;
        for(j=0;j<=(i-1);j++)
        {
            sum+=array[i]*(pow(2,k)-1);
            k++;
        }
      printf("%d",sum);


    }

}














