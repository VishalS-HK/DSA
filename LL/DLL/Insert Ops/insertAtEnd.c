#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* prev;
    struct node* next;
};

typedef struct node NODE;

NODE* insertAtEnd(NODE*, int);
void displayDLL(NODE*);

int main(){

    NODE* head = NULL;
    int value;
    int choice;
    while(!0){
        printf("\n-------------------------------------------------------------------");
        printf("\n1.Enter the data to be inserted at the end");
        printf("\n2. Display");
        printf("\n0.Enter '0' for exiting the program!");
        printf("\n-------------------------------------------------------------------\n");

        printf("\nEnter your choice : ");
        scanf("%d", &choice);

        switch(choice){

            case 1:
                printf("Enter the data to be inserted : ");
                scanf("%d", &value);
                head = insertAtEnd(head, value);
                displayDLL(head);
                break;
            
            case 2:
                displayDLL(head);
                break;
            
            case 0:
                exit(0);
                break;
        }
    }
    return 0;
}

NODE* insertAtEnd(NODE* head, int data){

    NODE* newNode = (NODE*)malloc(sizeof(NODE));
    newNode -> data = data;

    if(head == NULL){
        newNode -> prev = NULL;
        newNode -> next = NULL;
        head = newNode;
    }
    else{
        NODE* temp = head;
        while(temp -> next != NULL){
            temp = temp -> next;
        }
        temp -> next = newNode;
        newNode -> prev = temp;
        newNode -> next = NULL;
    }
    return head;
}

void displayDLL(NODE* head){
    if(head == NULL){
        printf("The DLL is empty!! There is nothing to display");
    }
    NODE* temp;
    temp = head;
    while(temp){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}