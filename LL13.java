public class LL13 {
    // delete at value; find target if get then delete them

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

     private boolean deleteValue( int target){
       if(head == null){
        System.out.println("delete not possible");
        return false;
       }
       if(head.data == target){
        //delete head
        return true;
       }
 
       node prev = head;
       node current = head.next;

       while (current != null) {
        if(current.data ==target){
            node forward = current.next;
            prev.next = forward;
            current.next = null;

            if(tail == current){
                tail = prev;
            }
            size--;
            return true;
        }else{
            prev = prev.next;
            current = current.next;
        }
       }

       return false;
    }

     private void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL13 myList = new LL13();
        myList.deleteValue(20);
        myList.printList();
    }
}
