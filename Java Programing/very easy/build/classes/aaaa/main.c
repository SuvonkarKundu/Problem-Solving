#include <stdio.h>
#include <string.h>

int main()
{
    char ch[100],ans[100];
long long int num,y,i,p=0,l=0,Rem,h;
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
ans[p]='\0';
for(i=0;i<p;i++)
printf("%c",ans[i]);

}
return 0;
}
