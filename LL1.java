public class LL1{
    //Basic code of link list where head tail are null so size are zero

    static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    public LL1(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

     public static void main(String[] args) {
        LL1 myList = new LL1();
     }
}