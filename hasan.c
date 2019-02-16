#include<stdio.h>
#include<string.h>
void main()
{
    char a[100],b[100];
    int i,j,y,count=0;
    gets(a);
    y=strlen(a);
    for(i=0;i<y;i++)
    {
     if(a[i]==' ')
     count++;
    }

     for(i=0;i<y;i++)
      {
        if(a[i]==' ')
        continue;
        for(j=0;j<y-count;j++)
        {
        b[j]=a[i];
        //j++;
        }
     }

puts(b);

}

