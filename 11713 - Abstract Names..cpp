#include<iostream>
#include <cstdio>
#include<cstring>
using namespace std;
main()
{
    char astr[30],abstract[30];
    int n,y,r;
    cin>>n;
    getchar();
    for(int i=1;i<=n;i++)
    {
        gets(astr);
        gets(abstract);
        y=strlen(astr);
        r=strlen(abstract);
        if(y!=r)
        {
            cout<<"No"<<"\n";
        }
        else if(y==r)
        {
            for(int j=0;j<=y;j++)
            {
                if(astr[j]!='a'||astr[j]!='e'||astr[j]!='i'||astr[j]!='o'||astr[j]!='u')
                {
                    if(astr[j]!=abstract[j])
                    {
                        cout<<"No"<<"\n";
                        break;
                    }

                }
               else if((astr[j]==abstract[j])||(abstract[j]=='a'||abstract[j]=='e'||abstract[j]=='i'||abstract[j]=='o'||abstract[j]=='u'))
                {      continue;


                }
              if(abstract[j]=='\0')
               {
                   cout<<"Yes"<<"\n";
               }
            }

        }




    }



}


