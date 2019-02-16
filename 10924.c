#include<stdio.h>
#include<string.h>
int main()
{
   char array1[1000];
  long long int y,sum,i,j,v;
   while(gets(array1)!=EOF)
   {
      sum=0;
       y=strlen(array1);
    for(i=0;i<y;i++)
    {
      if(array1[i]=='a')
      {
          sum+=1;
      }
     if(array1[i]=='b')
      {
          sum+=2;
      }
    if(array1[i]=='c')
      {
          sum+=3;
      }
      if(array1[i]=='d')
      {
          sum+=4;
      }

    if(array1[i]=='e')
      {
          sum+=5;
      }
      if(array1[i]=='f')
      {
          sum+=6;
      }
    if(array1[i]=='g')
      {
          sum+=7;
      }
      if(array1[i]=='h')
      {
          sum+=8;
      }
      if(array1[i]=='i')
      {
          sum+=9;
      }
      if(array1[i]=='j')
      {
          sum+=10;
      }
      if(array1[i]=='k')
      {
          sum+=11;
      }
      if(array1[i]=='l')
      {
          sum+=12;
      }
      if(array1[i]=='m')
      {
          sum+=13;
      }
      if(array1[i]=='n')
      {
          sum+=14;
      }
      if(array1[i]=='o')
      {
          sum+=15;
      }
      if(array1[i]=='p')
      {
          sum+=16;
      }
      if(array1[i]=='q')
      {
          sum+=17;
      }
      if(array1[i]=='r')
      {
          sum+=18;
      }
      if(array1[i]=='s')
      {
          sum+=19;
      }
      if(array1[i]=='t')
      {
          sum+=20;
      }
      if(array1[i]=='u')
      {
          sum+=21;
      }
      if(array1[i]=='v')
      {
          sum+=22;
      }if(array1[i]=='w')
      {
          sum+=23;
      }
      if(array1[i]=='x')
      {
          sum+=24;
      }
      if(array1[i]=='y')
      {
          sum+=25;
      }
      if(array1[i]=='z')
      {
          sum+=26;
      }
     if(array1[i]=='A')
      {
          sum+=27;
      }
     if(array1[i]=='B')
      {
          sum+=28;
      }
    if(array1[i]=='C')
      {
          sum+=29;
      }
      if(array1[i]=='D')
      {
          sum+=30;
      }

    if(array1[i]=='E')
      {
          sum+=31;
      }
      if(array1[i]=='F')
      {
          sum+=32;
      }
    if(array1[i]=='G')
      {
          sum+=33;
      }
      if(array1[i]=='H')
      {
          sum+=34;
      }
      if(array1[i]=='I')
      {
          sum+=35;
      }
      if(array1[i]=='J')
      {
          sum+=36;
      }
      if(array1[i]=='K')
      {
          sum+=37;
      }
      if(array1[i]=='L')
      {
          sum+=38;
      }
      if(array1[i]=='M')
      {
          sum+=39;
      }
      if(array1[i]=='N')
      {
          sum+=40;
      }
      if(array1[i]=='O')
      {
          sum+=41;
      }
      if(array1[i]=='P')
      {
          sum+=42;
      }
      if(array1[i]=='Q')
      {
          sum+=43;
      }
      if(array1[i]=='R')
      {
          sum+=44;
      }
      if(array1[i]=='S')
      {
          sum+=45;
      }
      if(array1[i]=='T')
      {
          sum+=46;
      }
      if(array1[i]=='U')
      {
          sum+=47;
      }
      if(array1[i]=='V')
      {
          sum+=48;
      }if(array1[i]=='W')
      {
          sum+=49;
      }
      if(array1[i]=='X')
      {
          sum+=50;
      }
      if(array1[i]=='Y')
      {
          sum+=51;
      }
      if(array1[i]=='Z')
      {
          sum+=52;
      }
    }
           if(sum==1)
            {
                 printf("It is a prime word.\n");
            }
        for(v=2;v<=sum;v++)
        {
            if(v==1)
            {
                 printf("It is a prime word.\n");
            }

            if(sum%v!=0)
            {
                continue;
            }
       if(sum==v)
        {
            printf("It is a prime word.\n");
        }
        else
        {
            printf("It is not a prime word.\n");
        }
        break;
    }

   }
return 0;
   }
















