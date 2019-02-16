#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n,array[10000];
   while(cin>>n)
   {
       if(n==0)
        break;
        int sum=0,maximum=0;
       for(int i=0;i<n;i++)
       {
         cin>>array[i];
         sum+=array[i];
         if(sum<0)
            sum=0;
         else
         {
             if(sum>maximum)
             {
                 maximum=sum;
             }
         }
       }
       if(sum!=0)
       {
           printf("The maximum winning streak is %d.\n",maximum);
       }
       else{

         printf("Losing streak.\n");
       }


   }

}













