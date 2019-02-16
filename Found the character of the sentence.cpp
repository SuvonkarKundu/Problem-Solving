#include<stdio.h>
#include<string.h>
int main()
{
char str[100],y;
int h,i;
gets(str);
y=getchar();
h=strlen(str);
for(i=0;i<h;i++)
{
if(str[i]!=y)
continue;
if(str[i]==y)
printf("Found");
break;

}
if(str[i]!=y)
printf("Not Found");
return 0;
}














