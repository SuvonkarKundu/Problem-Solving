#include<graphics.h>
#include<conio.h>
main()
	{
	int gd=DETECT, gm;

	initgraph(&gd, &gm, “C:\\TC\\bgi”);

	line(0,0,200,200);

	getch();
	closegraph();
	}

