public class LL9{
    //update old value to new value
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
     
    private void updateValue(int oldVlaue, int newVale){
        node temp = head;
        while (temp != null) {
            if(temp.data == oldVlaue){
                temp.data = newVale;
            }
            temp = temp.next;
        }
    }
   private void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

     public static void main(String[] args) {
        LL9 myList = new LL9();
        myList.updateValue(30,50);
        myList.printList();
     }
}