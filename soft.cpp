#include<iostream>
using namespace std;
class soft
{
int a,b,h;
public:
void number(void);
void coast(void)
{
cout<<a<<"\n";
cout<<b<<"\n";

}

void input(void)
{
	cin>>a;
	cin>>b;
}

};

void soft::number(void)
{
a=a+b;
b=a-b;
a=a-b;
}

int main()
{
soft y;
y.input();
y.number();
y.coast();
return 0;
}
