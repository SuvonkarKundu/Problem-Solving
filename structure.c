#include <stdio.h>
#include <string.h>

struct student
{
    char name [30];
    int roll;
    char ads[20];
};


int edit(int *n, char a[30], char s[20])
{
    int i;



}

main()
{
    struct student s[500];
    char ch[2];
    int k,temp;
    char a[50];
    int n,m,i,j;
    printf("No of students : ");
    scanf("%d",&n);
    getchar();
    for(i=0;i<n;i++)
    {
        printf("\n\n#%d:\n",i+1);
        printf("Roll no: ");
        scanf("%d",&s[i].roll);
        getchar();
        printf("Name of student : ");
        gets(s[i].name);
        printf("Address : ");
        gets(s[i].ads);
    }

    while(1)
    {
        printf("\n\nEnter your command:\n");
        printf("*To SORT   > press S\n");
        printf("*To PRINT  > press P\n");
        printf("*To SEARCH > press H\n");
        printf("*To EDIT   > press E\n");
        printf("*To CLOSE  > press C\n");
        printf("...........> ");
        gets(ch);
        if(ch[0]=='C'|| ch[0]=='c')
        {
            break;
        }
        else if(ch[0]=='S'|| ch[0]=='s')
        {

            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-1-i;j++)
                {
                    if(s[j].roll>s[j+1].roll)
                    {
                        temp=s[j].roll;
                        s[j].roll=s[j+1].roll;
                        s[j+1].roll=temp;
                        strcpy(a,s[j].name);
                        strcpy(s[j].name,s[j+1].name);
                        strcpy(s[j+1].name,a);
                        strcpy(a,s[j].ads);
                        strcpy(s[j].ads,s[j+1].ads);
                        strcpy(s[j+1].ads,a);
                    }
                }
            }
        }
        else if(ch[0]=='P'|| ch[0]=='p')
        {
            for(i=0;i<n;i++)
            {
                printf("\n\n#%d:\n",i+1);
                printf("Roll no: %d\n",s[i].roll);
                printf("Name of student :%s\n", s[i].name);
                printf("Address : %s\n",s[i].ads);
            }
        }
        else if(ch[0]=='H'|| ch[0]=='h')
        {
            printf("\n\nInput roll number : ");
            scanf("%d",&m);
            getchar();
            for(i=0;i<n;i++)
            {
                if(m==s[i].roll)
                {
                    break;
                }
            }
            if(i==n)
            {
                printf("Invalid roll number.\n");
            }
            else
            {
                printf("The result of search: \n");
                printf("Roll no: %d\n",s[i].roll);
                printf("Name of student :%s\n", s[i].name);
                printf("Address : %s\n",s[i].ads);
            }
        }
        else if(ch[0]=='E'||ch[0]=='e')
        {
            printf("\n\nInput roll number : ");
            scanf("%d",&m);
            for(i=0;i<n;i++)
            {
                if(m==s[i].roll)
                {
                    break;
                }
            }
            printf("Roll no: ");
        scanf("%d",&s[i].roll);
        getchar();
        printf("Name of student : ");
        gets(s[i].name);
        printf("Address : ");
        gets(s[i].ads);
        }
    }
}
