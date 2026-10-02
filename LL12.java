public class LL12 {
    // detetat posiion

     static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    private void deleteAtPosition(int position) {
        if (position < 1 || position > size + 1) {
            return;
        }
          if(position == 1){
            //delete head
            return ;
          }
          if(position == size){
            //delete tail
            return ;
          }
          node previous =head;
          for(int i= 0;i<= position-2; i++){
            previous = previous.next;
          }
          node current =  previous.next;
          node forward = current.next;

          previous.next = forward;
          current.next = null;

          size--;
    } 

    public void printList() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
   public static void main(String[] args) {
     LL12 myList = new LL12();
     myList.deleteAtPosition(3);
     myList.printList();
   } 
}
