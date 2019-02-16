#include<stdio.h>
main()
{
    int t,q,w,e,r,h,carry[100],counter[1000],i,j,c,count,sum;
    while(1)
    {
        i=0;
        j=0;
        count=0;
        sum=0;
        h=0;
        scanf("%d %d",&t,&q);
        if(t==0&&q==0)
        {
            break;
        }
        for(r=0;r<=20;r++)
        {
            carry[r]=0;
            counter[r]=0;
        }
         while(t!=0)
         {
             carry[i]=t%10;
             t=t/10;
             i++;
         }
         while(q!=0)
         {
             counter[j]=q%10;
             q=q/10;
             j++;
         }

        if(i>j)
        {
            w=i;
        }
        else
        {
            w=j;
        }

        for(c=0;c<w;c++)
        {
            sum=carry[c]+counter[c]+h;
            h=sum/10;
            if(sum%10!=sum)
            {
                count++;
            }
        }
        if(count==0)
         {
             printf("No carry operation.\n");
         }
         else if(count==1)

        {
            printf("%d carry operation.\n",count);
        }
         else if(count>1)
         {
              printf("%d carry operations.\n",count);
         }
    }
return 0;
}













