
public class LL22 {
// backward traversing of doubly LL
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

   
private void backwardTraversal(){
    Node temp=tail;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.prev;
    }
    System.out.println();
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
        LL22 muylist = new LL22();
        muylist.backwardTraversal();
        muylist.printList();
    }
}
