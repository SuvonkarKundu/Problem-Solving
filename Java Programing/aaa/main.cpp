
#include<stdio.h>
#include<string.h>
int main()
{
char a[100],b[100],c[100],d[5]={0};
int l,onhand,x,y,z,ans,i,t;
gets(a);
gets(b);
l=strlen(a);
for(i=0;i<l;i++)
{
    if(a[i]!='\0')
    continue;
    else
    a[i]=d[0];
}
strrev(a);
strrev(b);
onhand=0;

for(i=0;i<l;i++)
{
 x=a[i]-48;
 y=b[i]-48;
if(y>0)
{
z=x+y+onhand;
onhand=z/10;
ans=z%10;
c[i]=ans+48;

}
else
{
 z=x+onhand;
onhand=z/10;
ans=z%10;
c[i]=ans+48;
}
}
if(onhand>0)
{
c[i]=onhand+48;
i++;
}
for(t=i-1;t>=0;t--)
printf("%c",c[t]);
return 0;
}





