#include <bits/stdc++.h>
#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
   for(int j=0;j<n/2;j++)
       {
       int temp=arr[j];
       arr[j]=arr[(n-1)-j];
       arr[(n-1)-j]=temp;
   }
           for(int j=0;j<n;j++)
           {
               cout<<arr[j];
           }
    return 0;
}
