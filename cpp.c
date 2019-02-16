#include<iostream>
using namespace std;
class set
{
int m,n;
public:
void input(void);
void display(void);
};
void set::input(void)
{
cin>>m>>n;
}
void set:: display(void)
{
cout<<m;
cout<<n;
}
main()
{
set A;
A.input();
A.display();
}





