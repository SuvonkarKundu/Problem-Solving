#include<stdio.h>
#include<conio.h>
#include<graphics.h>
main()
{
  int gd=DETECT,gm;
  initgraph(&gd,&gm,"C:\\TC\\BGI");
  line(50,100,50,350);
  circle(125,150,25);
  line(50,100,200,100);
 line(200,100,200,200);
 line(200,200,50,200);
  getch();
  closegraph();

}
