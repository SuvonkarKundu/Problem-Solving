#include<iostream>
using namespace std;
class A
{
    float x,h,n,j,z;
    public:
    float fac(float b);
    float pow(float x ,float j);
    void sum (void);
    void input(void)
    {
        cin>>x;
        cin>>n;
        cin>>j;
    }
    void output(void)
    {
        cout<<z;
    }

};
float A::fac(float b)
{
    float h=1;
    for(int i=1;i<=n;i++)
    {
        h=h*i;
        return(h);
    }
}

float A::pow(float x,float j)
{
    int q;
    q=x;
    for(int i=1;i<=j;i++)
    {
      q*=i;
    return(q);
    }
}
void A::sum(void)
{
      float z=0;
      int i;
      for()
    if(i%2!=0)
    z-=pow(x,j)/fac(n);
    else
    z+=pow(x,j)/fac(n);
}
int main()
{
    A ob1;
    ob1.input();
    ob1.serices();
    ob1.output();


}




















