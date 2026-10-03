public class LL17 {
// insert at tail

    static class node{
        int data;
        node previous;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    private void indertAtTail(int data){
        node newNode = new node(data);

        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;

            size++;
        }
    } 
 public void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         LL17 myList = new LL17();
        myList.indertAtTail(50);
        myList.printList();
    }
}
