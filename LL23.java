
public class LL23 {
// search in doubly LL
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

   
private int search(int data){
    Node temp=head;
    int position=1;
    while(temp!=null){
        if(temp.data==data){
            return position;
        }
        temp=temp.next;
        position++;
    }
    return -1;
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
        LL23 muylist = new LL23();
        muylist.search(20);
        muylist.printList();
    }
}
