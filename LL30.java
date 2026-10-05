//insert at positio of circular singly link list
public class LL30{
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

    private void insertAtPosition(int position,int data){
        if(position<1||position>size+1){
            return;
        }
        Node newNode=new Node(data);
        if(position==1){
            if(head==null){
                head=newNode;
                tail=newNode;
                newNode.next=head;
            }else{
                newNode.next=head;
                head=newNode;
                tail.next=head;
            }
        }else if(position==size+1){
            newNode.next=head;
            tail.next=newNode;
            tail=newNode;
        }else{
            Node temp=head;
            for(int i=1;i<position-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
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
        LL30 list=new LL30();
        list.insertAtPosition(1,10);
        list.insertAtPosition(2,20);
        list.insertAtPosition(2,15);
        list.insertAtPosition(4,30);
        list.display();
    }
}
