//insert at head of circular singly link list
public class LL28{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    private void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }
        size++;
    }

    private void display(){
        if(head==null){
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args){
        LL28 list=new LL28();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
    }
}
