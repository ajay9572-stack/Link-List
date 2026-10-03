public class LL15 {
    // Basic code for doubly Link List

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

    public  LL15(){
       this.head = null;
       this.tail = null;
       this.size = 0;
    }

    public static void main(String[] args) {
        
    }
}
