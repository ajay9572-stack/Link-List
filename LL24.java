
public class LL24 {
// update in doubly LL
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

   
private void updatePosition(int position,int data){
    if(position<1 || position>size){
        return;
    }
    Node temp=head;
    for(int i=1;i<position;i++){
        temp=temp.next;
    }
    temp.data=data;
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
        LL24 muylist = new LL24();
        muylist.updatePosition(5,20);
        muylist.printList();
    }
}
