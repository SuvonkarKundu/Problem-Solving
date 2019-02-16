
#include<stdio.h>
#include<stack>
using namespace std;
main()
{
    char a[100][100];
    int count,p,q,r,c,i,j,tc=0;
    stack<int>x;
    stack<int>y;

  while(1)
    {   count=0;
    scanf("%d",&r);
        for(i=0;i<r;i++)
            scanf("%s",a[i]);
            tc++;
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                if(a[i][j]=='1')
                {
                    count++;
                   x.push(i);
                   y.push(j);
                   while(!x.empty())
                   {
                       p=x.top();
                       q=y.top();
                       x.pop();
                       y.pop();

                       a[p][q]='0';
                       if((q-1)>=0&&a[p][q-1]=='1')
                       {
                           a[p][q-1]='0';
                           x.push(p);
                           y.push(q-1);

                       }

                      if((q+1)<c&&a[p][q+1]=='1')
                       {
                           a[p][q+1]='0';
                           x.push(p);
                           y.push(q+1);

                       }
                   if((q-1)>=0&&(p-1)>=0&&a[p-1][q-1]=='1')
                       {
                           a[p-1][q-1]='0';
                           x.push(p-1);
                           y.push(q-1);

                       }
                   if((q-1)>=0&&a[p-1][q]=='1')
                       {
                           a[p-1][q]='0';
                           x.push(p-1);
                           y.push(q);

                       }

                   if((p-1)>=0&&a[p-1][q+1]=='1')
                       {
                           a[p-1][q+1]='0';
                           x.push(p-1);
                           y.push(q+1);

                       }

                   if((q-1)>=0&&(p+1)<r&&a[p+1][q-1]=='1')
                       {
                           a[p+1][q-1]='0';
                           x.push(p+1);
                           y.push(q-1);

                       }
                   if((p+1)>=0&&a[p+1][q]=='1')
                       {
                           a[p+1][q]='0';
                           x.push(p+1);
                           y.push(q);

                       }
                   if((q+1)<c&&(p+1)<r&&a[p+1][q+1]=='1')
                       {
                           a[p+1][q+1]='0';
                           x.push(p+1);
                           y.push(q+1);
                       }

                   }

                }

            }


        }
printf("Image number %d contains %d war eagles\n",tc,count);

    }

return 0;

}
















