#include<iostream>
#include<cstdio>
#include<vector>
#include<stack>
using namespace std;
#define M 10000
vector<int> edges[M];
vector<int> cost[M];

void dfs(int n, int source)
{

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
       dfs(N,source);

       return 0;
}
