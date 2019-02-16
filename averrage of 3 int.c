#include<stdio.h>
main()
{int roll,marks;
char name[10],sex[6];
float exp;
scanf("%d%d%d",&roll,&marks);
gets(name);
gets(sex);
printf("\n");
scanf("%f",&exp);
puts(name);
printf("%d",roll);
printf("%d",marks);
puts("sex");
printf("%f",exp);
}
