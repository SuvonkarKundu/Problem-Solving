#include<bits/stdc++.h>
using namespace std;
void brute_fource(string str,string str1);
int i,j,c=0;
int main()
{
 string text,pattern;
 cin>>text>>pattern;
 brute_fource(text,pattern);
 cout<<c;
}
-
void brute_fource(string str,string str1)
{
  int lenth1=str.size();
 int lenth2=str1.size();
for( i=0;i<lenth1;i++)
{
    for( j=0;j<lenth2,i+j<lenth1;j++)
    {
        if(str[i+j]!=str1[j])
            break;
    }
    if(j==lenth2)
    {
      printf("pattern found at: %d\n",i);
        c++;
    }

}
}
