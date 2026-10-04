
public class LL21 {
// delete at position of doubly LL
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

   

private void deleteAtPosition(int position){
    if(position<1 || position>size){
        return;
    }
    if(position==1){
      //  deleteAtHead();
        return;
    }
    if(position==size){
     //   deleteAtTail();
        return;
    }
    Node temp=head;
    for(int i=1;i<position;i++){
        temp=temp.next;
    }
   Node previous = temp.prev;
   Node nextNode = temp.next;

    previous.next = nextNode;
    nextNode.prev = previous;

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
        LL21 muylist = new LL21();
        muylist.deleteAtPosition(5);
        muylist.printList();
    }
}
