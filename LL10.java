public class LL10 {
    // delete first node of a LL

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

    public void deleteHead(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
          head = head.next;
          size--;

          if(head == null){
            tail = null;
          }
    }
    private void printList(){
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL10 myList = new LL10();
        myList.deleteHead();
        myList.printList();
    }
}
