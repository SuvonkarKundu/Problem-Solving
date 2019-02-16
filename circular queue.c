#include<stdio.h>
#include<conio.h>
#define max 5
int q[max];
int rear=-1,front=-1;
void insert();
void delet();
void display();

void main()
{
 char ch;
 int choice;
 do
 {
  scanf("%d",&choice);
  switch(choice)
  {
   case 1:
    insert();
    break;
   case 2:
    delet();
    break;
   case 3:
    display();
    break;
   default:
    printf("Invalid Choice\n");
  }
 }while(ch='y');
}
void insert()
{
 int data;
 if((rear==max-1 && front == 0 ) || rear==front-1)
 {
  printf(" Q is Full\n");
 }
 else
 {
  scanf("%d",&data);
  if(front==-1)
  {
   front++;
   rear++;
  }
  else if(rear==max-1)
  {
   rear=0;
  }
  else
  {
   rear++;
  }
  q[rear]=data;
 }
}
void delet()
{
 if(front==-1)
 {
  printf(" Q is Empty\n");
 }
 else
 {
  if(front==rear)
  {
   front=rear=-1;
  }
  else if(front==max-1)
  {
   front=0;
  }
  else
  {
   front++;
  }
 }
}
void display()
{
 int i;
 if(front==-1)
 {
  printf("Q is Empty\n");
 }
 else
 {
  printf(" Queue Elements are /n");
  if(front<=rear)
  {
   for(i=front;i<=rear;i++)
   {
    printf("%d",q[i]);
   }
  }
  else
  {
   for(i=front;i<max;i++)
   {
    printf("%d\n",q[i]);
   }
   for(i=0;i<=rear;i++)
   {
    printf("%d\n",q[i]);
   }
  }
 }
}





