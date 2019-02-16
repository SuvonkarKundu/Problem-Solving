#include<bits/stdc++.h>
#include<iostream>
using namespace std;
vector <int> G[1000];
int main()
{
 int n,node,broder,taken[1000]={0},distance[1000],source,distination,result,testcase=1;
while(scanf("%d",&n)!=EOF)
{
 for(int i=1;i<20;i++)
 {

     for(int j=1;j<=n;j++)
     {
         cin>>node;
       G[i].push_back(node);
       G[node].push_back(i);
     }
 }
 cin>>broder;

 for(int k=1;k<=broder;k++)
 {
     queue <int> Q;
     cin>>source>>distination;
     Q.push(source);
      taken[source]=1;
     distance[source]=0;
 while(!Q.empty())
  {

      int u=Q.front();
       Q.pop();
      int a=G[u].size();
      for(int i=0;i<a;i++)
      {
          int v=G[u][i];
          if(!taken[v])
          {

              distance[v]=distance[u]+1;
              if(v==distination)
              {
                result=distance[v];
                break;
              }

              taken[v]=1;
              Q.push(v);
          }
      }

  }


 }

printf("Test Set #%d",testcase);
 printf("%d to %d: %d",source,distination,result);
 testcase++;
}


}
