#include<stdio.h>
#include<math.h>
int main()
{
  long int array[100];
  long int t,n,q,i,w,e,r,y,v,j,t1,c;
    scanf("%ld",&t);
    for(i=1;i<=t;i++)
    {
        j=0;
        scanf("%ld",&n);
        q=n*567;
        w=q/9;
        e=w+7492;
        r=e*235;
        y=r/47;
        c=y-498;
        v=abs(c);
        while(v!=0)
        {
            array[j]=v%10;
            if(j==1)
            {
                printf("%ld\n",array[j]);
            }
            v=v/10;
            j++;
        }

    }
return 0;

}
















