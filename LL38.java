public class LL38{
   // insert at position
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

    private void insertAtPosition(int position,int data){
        if(position<1||position>size+1){
            return;
        }
        Node newNode=new Node(data);
        if(size==0){
            head=newNode;
            tail=newNode;
            head.next=head;
            head.prev=head;
        }else if(position==1){
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
        }else if(position==size+1){
            newNode.prev=tail;
            newNode.next=head;
            tail.next=newNode;
            head.prev=newNode;
            tail=newNode;
        }else{
            Node temp=head;
            for(int i=1;i<position;i++){
                temp=temp.next;
            }
            newNode.prev=temp.prev;
            newNode.next=temp;
            temp.prev.next=newNode;
            temp.prev=newNode;
        }
        size++;
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
        LL38 list=new LL38();
        list.insertAtPosition(1,10);
        list.insertAtPosition(2,20);
        list.insertAtPosition(2,15);
        list.insertAtPosition(4,30);
        list.printList();
    }
}
