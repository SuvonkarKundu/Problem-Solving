#include<stdio.h>
main()
{
   long long int tc,i,q,j,k,count,sum,farmyard,animals,environment,result,array[100000];
   double w,e,c;
    scanf("%lld",&tc);
    for(i=1;i<=tc;i++)
    {
        count=0;
        sum=0;
        scanf("%lld",&q);
        for(j=1;j<=q;j++)
        {
            scanf("%lld %lld %lld",&farmyard,&animals,&environment);
            w=(double)farmyard/(double)animals;
            e=w*(double)environment;
            c=e*(double)animals;
            array[count]=c;
            count++;
        }
        for(k=0;k<count;k++)
        {
            sum+=array[k];
        }
    printf("%lld\n",sum);
    }
return 0;
}













