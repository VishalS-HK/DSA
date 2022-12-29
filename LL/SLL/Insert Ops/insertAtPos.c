#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};

typedef struct node NODE;

void displaySLL(NODE*);
NODE* insertAtPos(NODE* , int, int);
NODE* insertAtEnd(NODE* , int);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    int pos;
    while(!0){
        printf("-------------------------------------------------------------------");
        printf("\n1.Insert at the end of the SLL");
        printf("\n2.Enter the data to be inserted at the particular position");
        printf("\n3.Display");
        printf("\n0.Exit");
        printf("\n-------------------------------------------------------------------\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        
        switch(choice){

            case 1:
                printf("Enter the data to be inserted at the end : ");
                scanf("%d", &value);
                head = insertAtEnd(head, value);
                break;

            case 2:
                printf("Enter the value : ");
                scanf("%d", &value);
                printf("Enter the position : ");
                scanf("%d", &pos);
                head = insertAtPos(head, value, pos);
                displaySLL(head);
                break;

            case 0:
                exit(0);
                break;
            
            case 3:
                displaySLL(head);
                break;
        }
    }
    return 0;
}

void displaySLL(NODE* head){
    if(head == NULL){
        printf("The SLL is empty!\n");
    }
    NODE* temp;
    temp = head;
    while(temp){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}

NODE* insertAtPos(NODE* head, int data, int pos){

    NODE* newNode;
    newNode = (NODE*)malloc(sizeof(NODE));
    newNode -> data = data;
    NODE* temp = head;

    pos--;
    while(pos != 1){
        temp = temp -> next;
        pos--;
    }
    newNode -> next = temp -> next;
    temp -> next = newNode;
    return head;
}

NODE* insertAtEnd(NODE* head, int data){
    NODE* newNode = (NODE*)malloc(sizeof(NODE));

    newNode -> data = data;
    newNode -> next = NULL;

    if(head == NULL){
        return newNode;
    }

    NODE* temp = head;

    while(temp -> next != NULL){
        temp = temp -> next;
    }
    temp -> next = newNode;
    return head;
}