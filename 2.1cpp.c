#include<stdio.h>
    void main()
    {
        double n,sum=0,i;


        printf("\n Please Give The Value of N:  ");
        scanf("%lf",&n);
        for(i=1;i<=n;i++)
        {
            sum = sum + (1/i);
            if(i==1)
                printf("\n 1 +");
            else if(i==n)
                printf(" (1/%d)  ",i);
            else
                printf(" (1/%d) + ",i);
        }
        printf("\n\n THE SUM OF THIS SERIES IS %.2lf",sum);

    }
