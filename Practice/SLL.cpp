#include<stdio.h>
#include<conio.h>
#include<malloc.h>
	void create();
	void display();
	void count();
	void ins_at_beg();
	void ins_at_end();
	void ins_at_pos();
	void del_at_beg();
	void del_at_end();
	void del_at_pos();
	void search();

int main()
{
	int ch;
	printf(" 1.Create a node \n 2. Display \n 3.Count number of nodes \n ");
	printf("4.Insert at beginning \n 5.Insert at end \n 6. Insert at any position \n ");
	printf("7.Delete from beginning \n 8. Delete from the end \n 9.Delete from any position \n 10. Search ");
	while(1)
	{
	printf("\nEnter your choice:");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
			create();
			break;
		case 2:
			display();
			break;
		case 3:
			count();
			break;
		case 4:
		 	ins_at_beg();
		 	break;
		case 5:
		 	ins_at_end();
		 	break;
		case 6:
		 	ins_at_pos();
		 	break;	
		case 7:
		 	del_at_beg();
		 	break;
		case 8:
		 	del_at_end();
		 	break;
		case 9:
		 	del_at_pos();
		 	break;
		case 10:
			 search();
			 break;
		default:
			return 0;	
}
}
}
struct node
{
	int info;
	struct node *next;
};
struct node* start= NULL;
struct node* ptr;
struct node *temp;

void create()
{
	struct node* ne;
	int c,info;
	start= (struct node*)malloc(sizeof(struct node));
	if(start==NULL)
	{
		printf("Unable to allocate");
	}
	else
		{
		printf("Enter the data:");
		scanf("%d", &start->info);
		start->next=NULL;
		printf("Press 1 to enter more nodes:\t");
		scanf("%d",&c);
		ptr=start;
			while(c==1)
			{
				ne=(struct node*)malloc(sizeof(struct node));
				if(ne==NULL)
				{
				printf("Overflow");
				}
				else
				{
					printf("Enter the data:");
		   		 scanf("%d", &ne->info);
					ne->next=NULL;
					
					ptr->next=ne;
					ptr=ptr->next;
					printf("Press 1 more nodes");
					scanf("%d",&c);
	    		 }
  			}
		}
	}	
	
void display()
{
	ptr=start;
	while(ptr->next!=NULL)
	{
		printf("%d->", ptr->info);
		ptr=ptr->next;
	}
		printf("%d", ptr->info);
}
void count()
{
	int cnt=1;
	ptr=start;
	while(ptr->next!=NULL)
	{
		cnt++;
		ptr=ptr->next;
	}
	printf("\n Number of nodes=%d",cnt);
}
void ins_at_beg()
{
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("Overflow");
	}
	else
	{
		printf("Enter the data:");
		scanf("%d",&newnode->info);
		newnode->next=start;
		start=newnode;
	}
}

void ins_at_end()
{
		struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("Overflow");
	}
	else
	{
		printf("Enter the data:");
		scanf("%d",&newnode->info);
		newnode->next=NULL;
		ptr=start;
		while(ptr->next!=NULL)
		{
			ptr=ptr->next;
		}
		ptr->next=newnode;
}
}
void ins_at_pos()
{
	int i=1;
	int pos;
	struct node *newnode;
	newnode=(struct node*)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("Overflow");
	}
	else
	{
		ptr=start;
		printf("enter the pos you want to insert the node:");
		scanf("%d",&pos);
		printf("Enter the data:");
		scanf("%d",&newnode->info);
		
		while(i<pos-1)
		{
			i++;
			ptr=ptr->next;
		}
		
		newnode->next=ptr->next;
		ptr->next=newnode;		
}
}

void del_at_beg()
{
	temp=start;
	start=start->next;
	free (temp);
}
 void del_at_end()
 {
 	ptr=start;
 	while(ptr->next->next!=NULL)
 	{
 		ptr=ptr->next;
	 }
	 ptr->next=NULL;
	 free (ptr->next);
 }
 void del_at_pos()
 {
 	int i=1;
 	int pos;
 	ptr=start;
 	printf("Enter the node pos which you want to delete: ");
 	scanf("%d",&pos);
 	while(i<pos-1)
 	{
 		i++;
 		ptr=ptr->next;
	 }
	 temp=ptr->next;
	 ptr->next=ptr->next->next;
	 free(temp);
 }
 void search()
 {
 	int cnt=0;
 	int num;
 	printf("Enter the number you want to search:");
 	scanf("%d",&num);
 	ptr=start;
 	while(ptr!=NULL)
 	{
 		cnt++;
 		if(ptr->info==num)
 		{
 			printf("Node is present at %d", cnt);
		 }
		 
		 ptr=ptr->next;
	}
	if(cnt==0)
	{
		printf("Node not found");
	}
		 	
		 
 }
 
