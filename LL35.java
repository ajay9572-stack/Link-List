//delete at position
public class LL35{
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
                tail.next=head;
            }
        }else{
            Node temp=head;
            for(int i=1;i<position-1;i++){
                temp=temp.next;
            }
            if(temp.next==tail){
                tail=temp;
                tail.next=head;
            }else{
                temp.next=temp.next.next;
            }
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
        LL35 list=new LL35();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.deleteAtPosition(3);
        list.printList();
    }
}
