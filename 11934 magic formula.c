#include<stdio.h>
#include<math.h>
main()
{
    long int a,b,c,d,l,sum,n,count,collect;
    while(1)
    {
        scanf("%ld%ld%ld%ld",&a,&b,&c,&d,&l);
        if(a==0&&b==0&&c==0&&d==0&&l==0)
        break;
        sum=0;
        count=0;
        for(n=0;n<=l;n++)
        {
            collect=a*pow(n,2)+b*n+c;
            sum+=collect;
            if(sum%d==0)
            {
                count++;
            }
        }
        printf("%ld\n",count);
    }
 return 0;
}












