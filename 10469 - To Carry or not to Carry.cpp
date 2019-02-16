#include<stdio.h>
#include<math.h>
main()
{
  unsigned long int q,w,ry,array[10000],e[10000],r,t,h,c[10000],y,g,v,sum,i,j,z;
    while(scanf("%lu%lu",&q,&w)!=EOF)
    {
        r=0;
        t=0;
        y=0;
        v=0;
        sum=0;
        while(q!=0)
        {
       array[r]=q%2;
       q=q/2;
        r++;
        }

         while(w!=0)
        {
        e[t]=w%2;
        w=w/2;
        t++;
        }
        if(r>t)
        {
           h=r;
        }
        else
        {
            h=t;
        }
        for(j=0;j<h;j++)
        {
          if((array[j]!=1)||(e[j]!=1))
             {
                 if(array[j]!=1)
             {
                  array[j]=0;
             }
                else if(e[j]!=1)
                {
                    e[j]=0;
                }
             }
        }
        for(i=0;i<h;i++)
        {
            z=array[i]+e[i];
            if(z==2)
            {
                c[y]=0;
            }
            else
            {
                 c[y]=z;
            }
            y++;
        }
        for(g=0;g<y;g++)
        {
                sum+=c[g]*pow(2,v);
                v++;
        }
    printf("%lu\n",sum);
    }
return 0;
}



















