#include<iostream>
using namespace std;
class myclass
{
    int a,b;
    public:
    int friend sum( myclass y);
    void set_ab(int i,int j);
};
void myclass::set_ab(int i,int j)
{
   a=i;
   b=j;
}
int sum(myclass y)
{
    return(y.a+y.b);
}
int main()
{  int a,b;
    myclass t;
    cin>>a>>b;
    t.set_ab(a,b);
    cout<<sum(t);
    return 0;
}














