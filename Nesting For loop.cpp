#include<iostream>
using namespace std;
class nesting
{
int n,h;
public:
int number(int h);
void input(void);
void output(void);
};
void nesting::input(void)
{
cin>>n;
}
void nesting::output(void)
{
cout<<number(n);
}
int nesting::number(int h)
{
for(int i=0;i<n;i++)
{
for(int j=1;j<=(n-i);j++)
{
//return(j);
cout<<j;
}
cout<<"\n";
}
}
int main()
{
nesting g;
g.input();
g.output();
return 0;
}









