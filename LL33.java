// delete at head
public class LL33{
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

    private void insertAtTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            newNode.next=head;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    private void deleteHead(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            tail.next=head;
        }
        size--;
    }

    private void printList(){
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
        LL33 list=new LL33();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.deleteHead();
        list.printList();
    }
}
