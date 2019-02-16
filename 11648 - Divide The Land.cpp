#include<iostream>
#include<cstdio>
#include<cmath>
using namespace std;
int main()
{
   double ab,cd,ad,bc,d,c,a,b,hieght1,area,angle1,angle2,length,hieght2,result1,result2;
    int land;
    cin>>land;
    for(int i=1;i<=land;i++)
    {
        cin>>ab>>cd>>ad>>bc;
        d=ab-cd;
        c=fabs(pow(bc,2)-pow(ad,2));
        a=fabs((c-pow(d,2))/(2.0*d));
        b=d-a;
        hieght1=sqrt(pow(ad,2)-pow(a,2));
        area=((ab+cd)*hieght1)/4.0;
        angle1=(hieght1/ad);
        angle2=(hieght1/bc);
        length=sqrt((pow(ab,2)+pow(cd,2))/2.0);
        hieght2=(2.0*area)/(ab+length);
        result1=hieght2/angle1;
        result2=hieght2/angle2;
       printf("Land #%ld: %lf %lf\n",i,result1,result2);
    }
return 0;
}

















