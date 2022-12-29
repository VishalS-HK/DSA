#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};

typedef struct node NODE;

void displaySLL(NODE*);
NODE* insertAtEnd(NODE* , int);
NODE* reverseSLL(NODE*);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    while(!0){
        printf("-------------------------------------------------------------------");
        printf("\n1.Enter the data to be inserted at the end");
        printf("\n2.Reverse the SLL");
        printf("\n3.Display");
        printf("\n0.Exit");
        printf("\n-------------------------------------------------------------------\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        
        switch(choice){

            case 1:
                printf("Enter the value : ");
                scanf("%d", &value);
                head = insertAtEnd(head, value);
                displaySLL(head);
                break;

            case 2:
                head = reverseSLL(head);
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
        printf("The SLL is empty !! \n");
    }
    
    NODE* temp = head;
    while(temp){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
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

NODE* reverseSLL(NODE* head){
    NODE* prev = NULL;
    NODE* next = NULL;
    while(head != NULL){
        next = head -> next;
        head -> next = prev;
        prev = head;
        head = next;
    }
    head = prev;
    return head;
}