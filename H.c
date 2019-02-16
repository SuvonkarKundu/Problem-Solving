
#include<stdio.h>
#include<math.h>
int main()
{
    long int i,k,num;
    int test,rt;
    long int sum;
    scanf("%d",&test);
    while(test--)
    {
        scanf("%ld",&num);
        if(num<0)
            continue;
        rt=pow(num,.5);
        sum=0;
        for(k=1;k<=rt;k++)
            sum=sum+(num/k-num/(k+1))*k;
        for(i=1;num/i>rt;i++)
            sum=sum+num/i;
        printf("%ld\n",sum);
    }
    return 0;
}



