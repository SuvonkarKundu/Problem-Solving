#include<iostream>
#include<cmath>
using namespace std;
long long H(int n);
int main()
{
    long int n,q;
    int tc;
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        cin>>n;
        q=H(n);
        cout<<q<<"\n";
    }

}
long long H(int n)
{
    long long res=0;
    long long rt=pow(n,0.5);
    for(int i=1;i<=rt;i++)
    {
         res=res+(n/i-n/(i+1))*i;
    }
     for(int k=1;n/k>rt;k++)
            res=res+n/k;
    return res;
}










