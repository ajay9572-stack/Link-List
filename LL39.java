//search in cdll
public class LL39{
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

    private int search(int data){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int position=1;
        do{
            if(temp.data==data){
                return position;
            }
            temp=temp.next;
            position++;
        }while(temp!=head);
        return -1;
    }

    public static void main(String[] args){
        LL39 list=new LL39();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        System.out.println(list.search(30));
    }
}
