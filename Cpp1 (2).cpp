#include<stdio.h>
#define ACCURACY 0.0001
void main()
{
int n,count;
float x,Term,sum;
printf("Enter value of x:");
scanf("%f",&x);
n=Term=sum=count=1;
while(n<=100)
{
Term=Term*x/n;
sum=sum+Term;
count=count+1;
if(Term<ACCURACY)
n=999;
else
n=n+1;
}
printf("Terms=%d,sum=%f\n",count,sum);

}
