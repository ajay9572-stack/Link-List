
public class LL20 {
// delete at tail of doubly LL
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

   
private void deleteAtTail(){
    if(head==null){
        return;
    }
    if(head==tail){
        head=tail=null;
    }else{
        tail=tail.prev;
        tail.next=null;
    }
    size--;
}
    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL20 muylist = new LL20();
        muylist.deleteAtTail();
        muylist.printList();
    }
}
