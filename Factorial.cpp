#include<iostream>
using namespace std;
class number
{
int a,h;
public:
int fac(void);
void input(void);
void display(void);
};
void number::input(void)
{
cin>>a;
}
int number :: fac(void)
{
int h=1;
for(int i=1;i<=a;i++)
{
h=h*i;
}
return(h);
}
void number::display(void)
{
 cout<<fac();
}
int main()
{
number y;
y.input();
y.display();
return 0;
}


