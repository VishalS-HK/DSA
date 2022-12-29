#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next;
};

typedef struct node NODE;

void displaySLL(NODE*);
NODE* deleteAtCertPos(NODE*, int);
NODE* insertAtEnd(NODE* , int);

int main(){
    NODE* head = NULL;
    int value;
    int choice;
    int pos;
    while(!0){
        printf("-------------------------------------------------------------------");
        printf("\n1.Enter the element to the end");
        printf("\n2.Delete a node at certain position");
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
                printf("Enter the position : ");
                scanf("%d", &pos);
                head = deleteAtCertPos(head, pos);
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

NODE* deleteAtCertPos(NODE* head, int pos){

    NODE* current = head;
    NODE* previous = head;

    if(head == NULL){
        printf("The SLL is empty!! There is nothing to delete!");
    }

    else if(pos == 1){
        head = current -> next;
        free(current);
        current = NULL;
    }

    while(pos != 1){
        previous = current;
        current = current -> next;
        pos--;
    }
    previous -> next = current -> next;
    free(current);
    current = NULL;
    return head;
}