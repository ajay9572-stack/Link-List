
public class LL4 {

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

    private void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            return;
        }
// insert at head
        if (position == 1) {
            node newNode = new node(data);
            newNode.next = head;
            head = newNode;
            // insert at tail
            if (tail == null) {
                tail = newNode;
            }
            size++;
            return;
        }
// insert at middle
        node prevnode = head;
        for (int i = 1; i <= position - 2; i++) {
            prevnode = prevnode.next;
        }
        node newnode = new node(data);
        newnode.next = prevnode.next;
        prevnode.next = newnode;
        size++;
    } 
    public void printList() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
    public static void main(String[] args) {
        LL4 myList = new LL4();
        myList.insertAtPosition(1, 23);
        myList.printList();
    }
}
