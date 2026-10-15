public class LL43{
//delete at position 
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

    private void deleteAtPosition(int position){
        if(position<1||position>size){
            return;
        }
        if(position==1){
            if(head==tail){
                head=null;
                tail=null;
            }else{
                head=head.next;
                head.prev=tail;
                tail.next=head;
            }
        }else if(position==size){
            tail=tail.prev;
            tail.next=head;
            head.prev=tail;
        }else{
            Node temp=head;
            for(int i=1;i<position;i++){
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
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
        System.out.println();
    }

    public static void main(String[] args){
        LL43 list=new LL43();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.printList();
        list.deleteAtPosition(3);
        list.printList();
    }
}
