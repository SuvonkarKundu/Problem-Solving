#include<iostream>
using namespace std;
template <class q>
void swap(q *a,q *b)
{
    q temp;
    temp=a;
    a=b;
    b=temp;
}
int main()
{
    int i=8,j=10;
    double r=11.68,t=12.88;
    char y='c',u='i';
    swap(i,j);
    swap(r,t);
    swap(y,u);
   cout<<i<<" "<<j<<"\n";
   cout<<r<<" "<<t<<"\n";
   cout<<y<<" "<<u<<"\n";
return 0;
}















