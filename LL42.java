
public class LL42{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
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
            head.next=head;
            head.prev=head;
        }else{
            newNode.prev=tail;
            newNode.next=head;
            tail.next=newNode;
            head.prev=newNode;
            tail=newNode;
        }
        size++;
    }

    private void deleteTail(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
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
        LL42 list=new LL42();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.deleteTail();
        list.printList();
    }
}
