#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* prev;
    struct node* next;
};

typedef struct node NODE;

NODE* insertInBet(NODE*, int, int);
NODE* insertAtEnd(NODE*, int);
void displayDLL(NODE*);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    int pos;
    while(!0){
        printf("\n-------------------------------------------------------------------");
        printf("\n1.Enter the data to be inserted at the end");
        printf("\n2.Enter the data to be inserted at a certain position");
        printf("\n3. Display");
        printf("\n0.Enter '0' for exiting the program!");
        printf("\n-------------------------------------------------------------------\n");

        printf("\nEnter your choice : ");
        scanf("%d", &choice);

        switch(choice){

            case 2:
                printf("Enter the data to be inserted : ");
                scanf("%d", &value);
                printf("Enter the position at which the data must be inserted : ");
                scanf("%d", &pos);
                head = insertInBet(head, value, pos);
                displayDLL(head);
                break;
            
            case 3:
                displayDLL(head);
                break;
            
            case 0:
                exit(0);
                break;

            case 1:
                printf("Enter the data to be inserted : ");
                scanf("%d", &value);
                head = insertAtEnd(head, value);
                displayDLL(head);
                break;
        }
    }
    return 0;
}

void displayDLL(NODE* head){

    if(head == NULL){
        printf("The DLL is empty!! There is nothing to print!");
    }
    NODE* temp;
    temp = head;
    while(temp){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
}

NODE* insertInBet(NODE* head, int data, int pos){
    NODE* newNode;
    newNode = (NODE*)malloc(sizeof(NODE));
    newNode -> data = data;
    newNode -> next = NULL;
    newNode -> prev = NULL;

    if(head == NULL){
        head = newNode;
    }

    else{
        NODE* temp;
        temp = head;
        pos--;
        while(pos != 1){
            temp = temp -> next;
            pos--;
        }
        newNode -> next = temp -> next;
        newNode -> prev = temp;
        temp -> next = newNode;
        temp -> next -> prev = newNode;
    }
    return head;
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