public class LL2{
    //insert at head

    static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private node head;
    private node tail;
    private int size;

      private void insertAtHead(int data){
        node newNode = new node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
      }
      public void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
      }

     public static void main(String[] args) {
        LL2 myList = new LL2();
        myList.insertAtHead(10);
        myList.insertAtHead(20);
        myList.insertAtHead(30);
        myList.insertAtHead(40);
        myList.insertAtHead(50);
        myList.insertAtHead(60);
        myList.printList();
        
     }
}