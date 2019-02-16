# include<iostream>
#include<math.h>
using namespace std;
class binary
{
    int arr[100],n,i,l,sum;
    public:
    void calculation(void);
    void output(void);
    void input(void)
    {
        cin>>n;
    }
};
void binary ::calculation(void)
{
  i=0,l=0,sum=0;
    while(n!=0)
    {
        arr[i]=n%10;
        n=n/10;
        i++;
    }
    for(int j=0;j<i;j++)
    {
        sum+=arr[j]*pow(2,l);
        l++;
    }
}
void binary :: output(void)
    {
        cout<<sum;
    }
 int main()
 {
     binary h;
     h.input();
     h.calculation();
     h.output();
     return 0;
 }









