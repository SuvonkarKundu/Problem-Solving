#include<stdio.h>
 main()
{
int Term1,Term2,Final,Attendance,ct1,ct2,ct3,n,i,sum,h,l;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
sum=0;
scanf("%d %d %d %d %d %d %d",&Term1,&Term2,&Final,&Attendance,&ct1,&ct2,&ct3);
if(ct1>=ct3&&ct2>=ct3)
h=(ct1+ct2)/2;
else if(ct1<=ct3&&ct2>=ct1)
h=(ct3+ct2)/2;
else
h=(ct1+ct3)/2;
sum+=Term1+Term2+Final+Attendance+h;
l=(sum/10);
switch(l)
{
case 10:
case 9:
printf("Case %d: A\n",i);
break;
case 8:
printf("Case %d: B\n",i);
break;
case 7:
printf("Case %d: C\n",i);
break;
case 6:
printf("Case %d: D\n",i);
break;
default :
printf("Case %d: F\n",i);
break;
}

}
return 0;
}














