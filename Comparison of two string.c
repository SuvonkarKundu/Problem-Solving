#include<stdio.h>
#include<string.h>
main()
{
    char str[100],str1[100];
    int i=0;
    gets(str);
    gets(str1);
    while(str[i]==str1[i]&&str[i]!='\0'&&str1[i]!='\0')
        i++;
    if(str[i]=='\0'&&str1[i]=='\0')
        printf("string are equale");
    else
        printf("string are not equale");
    return 0;
}












