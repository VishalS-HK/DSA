#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};

typedef struct node NODE;

void displaySLL(NODE*);
NODE* insertAtBeg(NODE* , int);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    while(!0){
        printf("-------------------------------------------------------------------");
        printf("\n1.Enter the data to be inserted at the beginning");
        printf("\n2. Display");
        printf("\n0.Enter '0' for exiting the program!");
        printf("\n-------------------------------------------------------------------\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);
        
        switch(choice){

            case 1:
                printf("Enter the value : ");
                scanf("%d", &value);
                head = insertAtBeg(head, value);
                displaySLL(head);
                break;

            case 0:
                exit(0);
                break;
            
            case 2:
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

NODE* insertAtBeg(NODE* head, int data){
    NODE* newNode = (NODE*)malloc(sizeof(NODE));
    newNode -> data = data;
    
    newNode -> next = head;
    head = newNode;
    return head;
}