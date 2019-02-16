#include<iostream>
#include<cstdio>
#include<vector>
#include<queue>
using namespace std;
#define M 10000
vector<int> edges[M];
vector<int> cost[M];

void Bfs(int n,int source)
{
  queue<int>Q;
  Q.push(source);;
  int taken[100]={0},distance[100];
  taken[source]=1;
  distance[source]=0;
  while(!Q.empty())
  {

      int u=Q.front();
      int a=edges[u].size();
      for(int i=0;i<a;i++)
      {
          int v=edges[u][i];
          if(!taken[v])
          {

              distance[v]=distance[u]+1;
              taken[v]=1;
              Q.push(v);
          }
      }
      Q.pop();
  }
  for(int i=1;i<=n;i++)
  {

      printf("%d to %d distance %d\n",source,i,distance[i]);
  }

}



int main()
{
    int N,E,i;
    int esize,source;
    scanf("%d%d",&N,&E);//how many nodes and edges
    for(i=1;i<=E;i++)
       {
           int x,y;
           scanf("%d%d",&x,&y);
           edges[x].push_back(y);
           edges[y].push_back(x);
           cost[x].push_back(1);
           cost[y].push_back(1);
       }
printf("plz enter source node:");
scanf("%d",&source);
       Bfs(N,source);

       return 0;
}






