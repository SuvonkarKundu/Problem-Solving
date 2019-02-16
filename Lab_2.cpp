#include<bits/stdc++.h>
#include<fstream>
using namespace std;


  void oddNumbers(){
      FILE *f1;
      printf("It is odd number\n");
  f1=fopen("G://oddNbr.txt","w");
  int cnt=0,a=1;
     while(cnt<100){
        fprintf(f1,"%d\n",a);
        printf("%d ",a);
        a=a+2;
        cnt++;
     }
  }

 void exponends(){
        FILE *f2;
        printf("It is exponends\n");
  f2=fopen("G://twosexponends.txt","w");
  long long cnt=0,a=1,b;

    while(cnt<20){
         b=pow(2,a);
        fprintf(f2,"%d\n",b);
        printf("%d ",b);
        a++;
        cnt++;
    }

 }


  void primeNumbers()
{
      FILE *f4;
      printf("It is prime number\n");
  f4=fopen("G://primes.txt","w");
    int i=2,j,h,k=0;
    while(k<20)
    {
      for(j=2; j<i; j++)
         {
               h=(i%j);
                 if(h!=0)
                   continue;
              else
                {
                break;
                }

         }
      if(i==j)
        {

             fprintf(f4,"%d\n",i);
             printf("%d ",i);
            k++;
        }

       i++;
    }

}





 void fibos(){
        FILE *f3;
         printf("It is fibonacci number\n");
  f3=fopen("G://fibonaccis.txt","w");

  int i=0,s=1,cnt=0;
    while(cnt<20){

       s=s+i;
       fprintf(f3,"%d\n",i);
       printf("%d ",i);
       i=s-i;
       cnt++;
    }

 }


   void fiveMultiples(){
    FILE *f5;
     printf("It is five and three number\n");
  f5=fopen("G://fivemults.txt","w");
  int cnt=1,b;
     while(cnt<=300){
       if((cnt%3)==0&&(cnt%5)==0)
       {
           fprintf(f5,"%d\n",cnt);
           printf("%d ",cnt);
       }

        cnt++;

     }

   }

struct task{
     string id;
     int time;
};

task mtask[100];

bool compare(task a, task b){

    if(a.time<b.time)
    {
     return true;
    }
  return false;
}

int main(){


  for(int i=0;i<5;i++)
    {
      cin>>mtask[i].id>>mtask[i].time;
    }

    sort(mtask,mtask+5,compare);

    for(int i=0;i<5;i++)
    {
      cout<<mtask[i].id<<"  "<<mtask[i].time<<endl;


    }

    /*oddNumbers();
    exponends();
    primeNumbers();
    fibos();
    fiveMultiples();*/
   for(int i=0;i<5;i++){
       if(mtask[i].id=="p1"){
            oddNumbers();
       }
       cout<<"\n";
     if(mtask[i].id=="p2"){
    exponends();
    }
    cout<<"\n";
         if(mtask[i].id=="p3"){
           primeNumbers();
        }
    cout<<"\n";
        if(mtask[i].id=="p4"){
    fibos();
        }
    cout<<"\n";
        if(mtask[i].id=="p5"){
    fiveMultiples();
        }

   }

}
