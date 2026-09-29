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

     public static void main(String[] args) {
        
     }
}