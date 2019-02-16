#include<iostream>
using namespace std;
int main()
{
    int tc;
    double x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6,a,b,c,a1,b1,c1,a2,b2,c2,a4,b4,c4,a3,b3,c3,x,y,x8,y8,x9,y9,x10,y10;
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;
        x5=x3;
        y5=y4;
        x6=x4;
        y6=y3;
        a=y1-y2;
        b=x2-x1;
        c=x1*y2-x2*y1;
        a1=y3-y6;
        b1=x6-x3;
        c1=x3*y6-x6*y3;
        a2=y3-y5;
        b2=x5-x3;
        c2=x3*y5-x5*y3;
        a3=y5-y4;
        b3=x4-x5;
        c3=x5*y4-x4*y5;
        a4=y4-y6;
        b4=x6-x4;
        c4=x4*y6-x6*y4;
        x=(b*c1-b1*c)/(a*b1-a1*b);
        y=(a1*c-a*c1)/(a*b1-a1*b);
        x8=(b*c2-b2*c)/(a*b2-a2*b);
        y8=(a2*c-a*c2)/(a*b2-a2*b);
        x9=(b*c3-b3*c)/(a*b3-a3*b);
        y9=(a3*c-a*c3)/(a*b3-a3*b);
        x10=(b*c4-b4*c)/(a*b4-a4*b);
        y10=(a4*c-a*c4)/(a*b4-a4*b);
        if((a*x+b*y+c)==0||(a*x8+b*y8+c)==0||(a*x9+b*y9+c)==0||(a*x10+b*y10+c)==0)
        {
            cout<<"T\n";
        }
        else
        {
            cout<<"F\n";
        }
    }
  return 0;
}











