#include<stdio.h>
main()
{
   long int count=0,v,t,c=0,n;
   while(scanf("%ld",&n)!=EOF);
   {
        t=1;
		v=0;
		if(n<0)
			break;
		while(t<n)
		{
		      t=2*t;
			  v++;
		if(t>=n)
		{  c++;
			break;
		}
		}
    printf("Case %ld: %ld\n",c,v);
   }
}

