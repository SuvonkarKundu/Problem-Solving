#include<iostream>
using namespace std;
class A
{
    int x,n,j;
    float z;
    public:
    int fac(int n);
    int pow(int x ,int j);
   int number (void);
    void input(void)
    {
        cin>>x;
        cin>>n;
        //cin>>j;
    }
    void output(void)
    {
        cout<<z;
    }

};
int A::fac(int n)
{
    if(n<=1)
    return 1;
    else
    return(n*fac(n-1));


}

int A::pow(int x,int j)
{
    int q;
    q=x;
    for(int i=2;i<=j;i++)
    {
      q*=x;
    return(q);
    }
}
int A::number(void)
{
       z=0;
      int i;
      for( i=2;i<=n;i++)
      {
          if(i%2==0)
          z-=pow(x,i)/(float) fac(i);
          else
          z+= pow(x,i)/(float) fac(i);
      }
       //cout<<z;
}
int main()
{
    A ob1;
    ob1.input();
    ob1.number();
    ob1.output();


}




















