#include<iostream>
using namespace std;
class set
{
int x,y;
public:
void input(void);
void display(void);
int number(void);
};
int set::number(void)
{
int h=1;
for(int i=0;i<y;i++)
{
for(int j=x;j<=x;j++)
{
h=h*x;
}

}
return(h);
}
void set ::input(void)
{
cout<<"Input values of y and x"<<"\n";
cin>>y>>x;
}
void set::display(void)
{
cout<<"Largest="<<number()<<"\n";
}
int main()
{
set a;
a.input();
a.display();
return 0;
}






