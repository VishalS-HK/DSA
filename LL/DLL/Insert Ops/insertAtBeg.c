#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* prev;
    struct node* next;
};

typedef struct node NODE;

void displayDLL(NODE*);
NODE* insertAtBeg(NODE*, int);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    while(!0){
        printf("\n-------------------------------------------------------------------");
        printf("\n1.Enter the data to be inserted at the beginning");
        printf("\n2. Display");
        printf("\n0.Enter '0' for exiting the program!");
        printf("\n-------------------------------------------------------------------\n");
        printf("\nEnter your choice : ");
        scanf("%d", &choice);

        switch(choice){
            case 1:
                printf("Enter the data to be inserted : ");
                scanf("%d", &value);
                head = insertAtBeg(head, value);
                displayDLL(head);
                break;

            case 2: 
                displayDLL(head);break;
            
            case 3:
                exit(0);
                break;
        }
    }
    return 0;
}

NODE* insertAtBeg(NODE* head, int data){
    NODE* newNode;
    newNode = (NODE*)malloc(sizeof(NODE));

    if(head == NULL){
        newNode -> data = data;
        newNode -> prev = NULL;
        newNode -> next = NULL;
        head = newNode;
    }
    else{
        newNode -> data = data;
        newNode -> prev = NULL;
        newNode -> next = head;
        head -> prev = newNode;
        head = newNode;
    }
    return head;
}

void displayDLL(NODE* head){
    if(head == NULL){
        printf("The DLL is empty!! There is nothing to display");
    }
    NODE* temp;
    temp = head;
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}