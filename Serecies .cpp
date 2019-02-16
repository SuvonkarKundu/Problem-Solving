#include<iostream>
using namespace std;
class A
{
    float x,h,n,j,z;
    public:
    float fac(float b);
    float pow(float x ,float j);
    float serices(float y,float i);
    void output(float a)
    {
        float z=a;
        cout<<z;
    }

};
float A::fac(float c)
{
      float b=c;
    if(b==1)
           return 1;
     else
             return fac(b-1)*b;
}

float A::pow(float x,float j)
{
    int sum,i,n=j;
    sum=1;
      for(i=1;i<=n;i++)
      {
            sum=sum*x;
      }
      return sum;
}
float A::serices(float p,float n)
{
    int x,i,z,o;
    x=p;
    o=n;
    z=0;
    for(i=1;i<=o;i=i+2)
    {
    if(i%2!=0)
    z-=pow(x,i)/fac(i);
    else
    z+=pow(x,i)/fac(i);
    }
    return z;
}
int main()
{
    A ob1;

    ob1.output(ob1.serices(2,2));
    return 0;


}




















