#include<stdio.h>
#include<string.h>
main()
{
    char tele[1000],telephone[1000];
    int y,array[100],i,t;
    while(gets(tele)!=EOF)
    {
        t=0;
        y=strlen(tele);
        for(i=0;i<y;i++)
        {
            if(tele[i]=='A'||tele[i]=='B'||tele[i]=='C')
            {
               array[t]=2;
            }
            else if(tele[i]=='D'||tele[i]=='E'||tele[i]=='F')
            {
                array[t]=3;
            }
            else if(tele[i]=='G'||tele[i]=='H'||tele[i]=='I')
             {
                 array[t]=4;
             }
             else if(tele[i]=='J'||tele[i]=='K'||tele[i]=='L')
             {
                 array[t]=5;
             }
              else if(tele[i]=='M'||tele[i]=='O'||tele[i]=='N')
             {
                 array[t]=6;
             }
             else if(tele[i]=='P'||tele[i]=='Q'||tele[i]=='R'||tele[i]=='s')
             {
                 array[t]=7;
             }
             else if(tele[i]=='T'||tele[i]=='U'||tele[i]=='V')
             {
                 array[t]=8;
             }
             else if(tele[i]=='W'||tele[i]=='X'||tele[i]=='Y'||tele[i]='Z')
             {
                 array[t]=9;
             }
             else if(tele[i]=='1'||tele[i]='0')
             {
                 if(tele[i]=='1')
                 {
                     array[t]=1;
                 }
                 else
                 {
                     array[t]=0;
                 }
             }
        }




    }
}













