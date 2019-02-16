#include<stdio.h>
#include<string.h>
void main()
{
    char a[100],b[100];
    int i,j=0,y;
    gets(a);
    y=strlen(a);
    for(i=0;i<y;i++)
    {
     if(a[i]==' ')
        continue;


        b[j]=a[i];
        if(i!=j)
        j++;
        //if(b[j]=='\0')
       // break;

    }

puts(b);

}












