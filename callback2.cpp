#include<stdio.h>


void print(int (*parameter) (void))
{
       printf("%d\n",parameter());

}

int test()
{
           return 45;

}
int glen()
{

               return  56;
}

int main()
{

           print(&test);
           print(&glen);

           return 0;

}
