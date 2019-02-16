#include<stdio.h>
#include<math.h>
bool prime(long long int n)
{
    int i=2;
    int chek=1;
    for(i=2;i<=sqrt(n);i++)
    {
        if(n%i==0)
            return false;
        else
            chek=1;
    }
    return true;
}

void fibonacci(FILE *fib)
{
   long long int x=0,y=1,z;
    long long int i=0;
    while(i<50)
    {
        if(i==0)
        {
            fprintf(fib,"%lld ",x);
            i++;
           }
        z=x;
        x=y;
        y=z+y;

        fprintf(fib,"%lld ",x);
        i++;
        }
}


int main()
{
    FILE *prim, *fibo,*out,*prmr,*fibor;

    bool bln;
    long long int i,j,n,num;
    long long int arprime[120],arfibo[120];

    prim=fopen("G://prime.txt","r+");
    fibo=fopen("G://fibo.txt","r+");
    out=fopen("G://out.txt","w");


    j=0;
    n=2;
    while(j<50)
    {
        bln=prime(n);
        if(bln)
        {
            fprintf(prim,"%d ",n);
            //arprime[j]=n;
            j++;
        }
        n++;
    }

    prmr=fopen("G:/prime.txt","r");



   // fscanf(prmr,"%d",&num);
   // printf("%d",num);

    i=0;
    while(fscanf(prmr,"%lld",&num)>0)
    {
        arprime[i]=num;
        i++;
    }
/*
    for(j=0;j<50;j++)
    {
        printf("%lld ",arprime[j]);
    }
*/
///////////////// fibonacci ///////////////
     fibonacci(fibo);

     fibor=fopen("G://fibo.txt","r");

      i=0;
      num=0;
    while(fscanf(fibor,"%lld",&num)>0)
    {
        arfibo[i]=num;
        i++;
    }
   /*
    printf("\n");
    for(j=0;j<50;j++)
    {
        printf("%lld ",arfibo[j]);
    }

*/
   for(i=0;i<50;i++)
   {
       num=arprime[i]-arfibo[i];
       printf("%lld   -   %lld :   %lld \n",arprime[i],arfibo[i],(arprime[i]-arfibo[i]));
       fprintf(out,"%lld ",num);

   }
///////////////////////////////////////////////
     fclose(prmr);
    fclose(prim);
    fclose(fibo);
    fclose(out);
    fclose(fibor);
}
