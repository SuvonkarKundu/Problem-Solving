#include<stdio.h>
main()
{
   int a,b,c;
   freopen("C:\\Documents and Settings\\delluser\\Desktop\\input.txt","r",stdin);
   freopen("C:\\Documents and Settings\\delluser\\Desktop\\output.txt","w",stdout);
   while(scanf("%d%d",&a,&b)!=EOF)
   {
       c=a+b;
       printf("%d\n",c);

   }
  return 0;

}
