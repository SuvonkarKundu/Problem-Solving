#include<iostream>
using namespace std;
class number
{
int h;
public:
int soft(int x,int y);
};
int number::soft(int x, int y)
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
int main()
{
int x,y,i;
number t;
cin>>x>>y;
i=t.soft(x,y);
cout<<i;
return 0;
}











