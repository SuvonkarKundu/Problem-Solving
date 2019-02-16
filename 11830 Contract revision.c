#include<stdio.h>
main()
{
     long int v,w,e,array[100],array1[100],i,j=0,count;
     while(1)
     {
         count=0;
          scanf("%ld%ld",&v,&w);
          while(w!=0)
          {
              array[j]=w%10;
              w=w/10;
              j++;
          }

         for(i=j-1;i>=0;i--)
         {
             if(array[i]==v)
             {
                 array[i]='\0';
                 continue;
             }
             array1[count]=array[i];
             count++;
         }
         for(e=0;e>=count-1;e++)
         {
              printf("%ld\n",array1[e]);


             //if(array1[e]=='\0'||array1[e]==0)
               //{
                 // printf("0\n");
//}
         }
     }

}

















