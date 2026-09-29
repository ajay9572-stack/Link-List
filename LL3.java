public class LL3 {
   //insert at tail
    static  class node {
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

       private void insertAttail(int data){
        node newNode = new node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
       }
    public static void main(String[] args) {
        
    }
}
