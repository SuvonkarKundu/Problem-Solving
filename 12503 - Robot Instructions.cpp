#include<iostream>
#include<cstring>
#include<cstdio>

using namespace std;
main()
{
    int tc,instruction,position,digit,t;
    char string[100];
    cin>>tc;
    for(int i=1;i<=tc;i++)
    {
        position=0;
        cin>>instruction;
        for(int j=1;j<=instruction;j++)
        {
            gets(string);
            getchar();
           if(string[0]=='S')
            {
                 digit=string[8]-48;
                 cout<<digit<<"\n";
            }
            cin>>digit;
            if(string[0]=='L'||t==digit)
            { t=j;
              position=position-1;
            }
           else
           {   t=j;
               position=position+1;
           }

        }
     cout<<position<<"\n";
    }
return 0;
}
















