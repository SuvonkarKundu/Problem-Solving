
#include<stdio.h>
#include<stack>
using namespace std;
main()
{
    char a[100][100];
    int count,p,q;
    stack<int>x;
    stack<int>y;
    while(scanf("%d %d",&r,&c)!=EOF)
    {   count=0;
        for(i=0;i<r;i++)
            scanf("%s",a[i]);
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(a[i][j]=='@')
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

                       a[p][q]='*'
                       if((q-1)>=0&&a[p][q-1]=='@')
                       {
                           a[p][q-1]='*';
                           x.push(p);
                           y.push(q-1);

                       }

                      if((q+1)<c&&a[p][q+1]=='@')
                       {
                           a[p][q+1]='*';
                           x.push(p);
                           y.push(q+1);

                       }
                   if((q-1)>=0&&(p-1)>=0&&a[p-1][q-1]=='@')
                       {
                           a[p-1][q-1]='*';
                           x.push(p-1);
                           y.push(q-1);

                       }
                   if((q-1)>=0&&a[p][q-1]=='@')
                       {
                           a[p][q-1]='*';
                           x.push(p);
                           y.push(q-1);

                       }

                   if((p-1)>=0&&a[p-1][q]=='@')
                       {
                           a[p-1][q]='*';
                           x.push(p-1);
                           y.push(q);

                       }
                   if((p-1)>=0&&(q+1)<c&&a[p-1][q+1]=='@')
                       {
                           a[p-1][q+1]='*';
                           x.push(p-1);
                           y.push(q+1);

                       }
                   if((q-1)>=0&&(p+1)<r&&a[p+1][q-1]=='@')
                       {
                           a[p+1][q-1]='*';
                           x.push(p);
                           y.push(q-1);

                       }
                   if((p+1)>=0&&a[p+1][q]=='@')
                       {
                           a[p+1][q]='*';
                           x.push(p+1);
                           y.push(q);

                       }
                   if((q+1)<c&&(p+1)<r&&a[p+1][q+1]=='@')
                       {
                           a[p+1][q+1]='*';
                           x.push(p+1);
                           y.push(q+1);

                       }

                   }

                }
                printf("%d",count);


            }



        }











    }











}
















