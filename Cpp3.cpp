#include<stdio.h>
main()
{
    int h1,h2,m1,m2,t,v,w,E,c,result,b,q,e,d,a,r,r1,i,w1;
    while(scanf("%d %d %d %d",&h1,&h2,&m1,&m2)!=EOF)
    {
        if(h1==0&&h2==0&&m1==0&&m2==0)
        break;
            if(h1>=1&&h2<=12)
            {
                t=h1-h2;
                v=60-m1;
                 w=t*60+q;
                printf("%d",t);
                if(h1>12&&h2<=23)
                {
                    e=(h1-h2)*60;
                    c=e+v;
                    printf("%d",c);
                }

            }
             if(h1==h2)
            {

                r=24*60;
                r1=(24*60)-(m1-m2);
                  printf("%d",r1);
            }
        }
        if(m1==0||m2==0)
        {
           i=60-m1;
           w1=m2+i;
          printf("%d",w1);
        }
        }

















