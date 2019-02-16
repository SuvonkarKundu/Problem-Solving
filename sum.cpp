#include<iostream>
using namespace std;
class myclass
{
int a,b,h;
public:
void number(void);
void output(void)
{
cout<<h;
}
void input(void)
{
cin>>a;
cin>>b;
}
};
void myclass:: number(void)
{
h=a+b;
}
int main()
{
myclass y;
y.input();
y.number();
y.output();
return 0;
}







