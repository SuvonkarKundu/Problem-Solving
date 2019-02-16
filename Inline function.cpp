#include<iostream>
using namespace std;
class myclass
{
    int a,b;
    public:
    void init(int i,int j);
    void show();
};
inline void myclass::init(int i,int j)
{
    a=i;
    b=j;
}
inline void myclass::show()
{
    cout<<a<<" "<<b<<"\n";
}
int main()
{
    myclass t;
    t.init(10,20);
    t.show();
return 0;
}



















