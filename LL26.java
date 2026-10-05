public class LL26 {
// Update old value to new value
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

    private void updateValue(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
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
        LL26 mylist = new LL26();
        mylist.updateValue(50, 20);
        mylist.printList();
    }
}