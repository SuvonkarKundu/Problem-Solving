#include<stdio.h>
main()
{
  int array[100],Item,i,n,Beg=1,mid,End,Loc;
  scanf("%d %d",&Item,&n);
  for(i=1;i<=n;i++)
  {
     scanf("%d",&array[i]);
  }
   End=n;
    mid=(Beg+End)/2;
    while(Beg<=End&&array[mid]!=Item)
    {
        if(Item<array[mid])
        {
            End=mid-1;
            mid=(Beg+End)/2;
        }
        else
        {
            Beg=mid+1;
            mid=(Beg+End)/2;
        }
    }

    if(array[mid]==Item)
    {
        Loc=mid;
        printf("%d",Loc);
    }
    else
    {
        printf("Not found");
    }
 return 0;
}





















