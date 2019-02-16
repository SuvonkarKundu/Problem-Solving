#include<bits/stdc++.h>
#define N 100009
#define INF 1<<30
using namespace std;
int arr[N];
int main(){
    int test,n,s,e,cnt=1,best_s,best_e;
    cin>>test;
    while(test--){

        cin>>n;
        s=1;
    for(int i=1;i<n;i++)
            cin>>arr[i];
            int flag=0;
            int max_so_far=-INF,curr_max=0;
    for(int i=1;i<n;i++){
       if(curr_max==0){
            if(flag==1) flag=0;
        //if(i-s==1)
        else        s=i;


       }
       curr_max=curr_max+arr[i];
       if(curr_max==0)flag=1;

       if(max_so_far<curr_max){
        max_so_far=curr_max;
        e=i;
        best_s=s;
        best_e=e;
       }
       if(curr_max==max_so_far){
        int c=best_e-best_s;
        int t1,t2,cur_r;
        t1=s;
        e=i;
        t2=e;
        cur_r=t2-t1;
        if(c<cur_r){
            best_e=t2;
            best_s=t1;
        }
       }
       if(curr_max<0){
        curr_max=0;

       }


    }
    if(max_so_far<=0){
        cout<<"Route "<<cnt++<<" has no nice parts"<<"\n";
    }
    else
        cout<<"The nicest part of route "<<cnt++<<" is between stops "<<best_s<<" and "<<best_e+1<<"\n";

    }
}

