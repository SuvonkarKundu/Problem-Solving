#include<stdio.h>
main()
{
   int i,tc;
  float c,d,f,result,store1,store;
   scanf("%f",&tc);
         for(i=1;i<=tc;i++)
      {
        scanf("%f %f",&c,&d);
         f=(1.8*c)+32;
         store=f+d;
         store1=(store-32)*5;
         result=store1/9;
		 printf("%0.2f",result);
		 
		 }

return 0;

}