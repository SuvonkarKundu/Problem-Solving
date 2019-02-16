#include<stdio.h>
int count =0;
void funct1(void);
main()
{
printf("please enter a line of text below");
funct1();
printf("%d",count);
}
void funct1(void)
{
char c;
if((c=getchar())!='\n')
{
++count;
funct1();
}
return;
}










