#include<bits/stdc++.h>
using namespace std;
int main(){
    int n,sum=0,t;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    for(int arr_j=0;arr_j<n;arr_j++)
        {
        t=arr[arr_j]+arr[arr_j+1];
        sum+=t;
    }
    cout<<sum;
    return 0;
}
