
#include<bits/stdc++.h>
#include<iostream>
using namespace std;
vector <int> G[1000];
//queue <int> Q;
int source;
int main()
{
    int n,e,count,colour[10000];

    while(scanf("%d",&n)!=EOF)
    {
       for(int i=0;i<1000;i++)
        G[i].clear();
        if(n==0)
            break;
        cin>>e;
        for(int i=0; i<e; i++)
        {
            int t,y;
            cin>>t>>y;
            if(i==0)
                source=t;

            G[t].push_back(y);
            G[y].push_back(t);
        }
        memset(colour,0,sizeof(colour));
        queue <int> Q;
        Q.push(source);
        colour[source]= 1;
        int flag=0;
        while(!Q.empty())
        {
            int u=Q.front();
            Q.pop();
            for(int i=0; i<G[u].size(); i++)
            {
                if(colour[G[u][i]]==0)
                {
                    if(colour[u]==1)
                    {
                       colour[G[u][i]]=2;

                    }


                    else
                        {
                                colour[G[u][i]]=1;
                                //Q.push(G[u][i]);
                        }
                        Q.push(G[u][i]);
                }
                else
                {
                    if(colour[G[u][i]]==colour[u])
                    {
                        flag=1;
                        break;
                    }
                }

            }
            if(flag==1) break;

        }


 if(flag==1)
    {
        cout<<"NOT BICOLORABLE.\n";
    }
    else
    {
        cout<<"BICOLORABLE.\n";
    }
    }

return 0;
}


