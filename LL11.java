public class LL11 {
    // delete last node of a LL

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

   public void deleteTail(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }

    if(head == tail){
        head = null;
        tail = null;
        size = 0;
        return;
    }

    node temp = head;

    for(int i = 0; i < size - 2; i++){
        temp = temp.next;
    }

    temp.next = null;
    tail = temp;
    size--;
}
    private void printList(){
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LL11 myList = new LL11();
        myList.deleteTail();
        myList.printList();
    }
}
