#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    int tc;
    double q1,q2,q3,q4,t,t1,x5,y5,x1,y1,x2,y2,x3,y3,x4,y4,a,b,c,a1,b1,c1;
    cout<<"INTERSECTING LINES OUTPUT\n";
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
        q1=x2-x1;
        q2=y2-y1;
        q3=x4-x3;
        q4=y4-y3;
        a=y1-y2;
        b=x2-x1;
        c=(x1*y2-x2*y1);
        a1=y3-y4;
        b1=x4-x3;
        c1=(x3*y4-x4*y3);
        x5=(b*c1-b1*c)/(a*b1-a1*b);
        y5=(c*a1-c1*a)/(a*b1-a1*b);
        if((a/a1==b/b1&&a/a1==c/c1)||(b==0&&c==0)||(a==0&&b==0&&c==0)||
            (b==0&&c/c1==a/a1)||(a==0&&c/c1==b/b1)||(a/a1==b/b1&&c==0)||(a==0&&a1==0&&c==0&&c1<=0))

        {
            cout<<"LINE\n";
        }
        else if(((q1*q4)-(q2*q3))==0)
        {
                cout<<"NONE\n";
        }
        else
        {
            printf("POINT %0.2lf %0.2lf\n",x5,y5);
        }

     }
     cout<<"END OF OUTPUT\n";
     return 0;
}
