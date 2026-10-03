public class LL16 {
// insert at head

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

    private void indertAthead(int data){
        node newNode = new node(data);

        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.previous = newNode;
            head = newNode;

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
        LL16 myList = new LL16();
        myList.indertAthead(10);
        myList.indertAthead(20);
        myList.indertAthead(30);
        myList.indertAthead(40);
        myList.indertAthead(50);
        myList.printList();
    }
}
