#include<stdio.h>
#include<string.h>
main()
{
char ch[10000],ans[10000];
long long int num,y,i,p,l,Rem=0,h,j=0;
p=0;
l=0;
gets(ch);
scanf("%lld",&num);
 y=strlen(ch);
for(i=0;i<y;i++)
{
Rem=(Rem*10)+(ch[i]-48);
if(num<=Rem||l!=0)
{
  h=Rem/num;
  ans[p]=h+48;
  p++;
  Rem=Rem%num;
  l++;
}
}
j++;
for(i=0;i<p;i++)
printf("%c",ans[i])
;
return 0;
}









