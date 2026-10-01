public class LL8{
    //update position 
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
     
    private void updatePosition(int position, int data){
        if( position < 1 || position >size+1){
            System.out.println("invalid position");
            return ;
        }
        node temp = head;
        for(int i= 0; i < position-1; i++){
            temp = temp.next;
        }
        temp.data = data;
    }
   private void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }

     public static void main(String[] args) {
        LL8 myList = new LL8();
        myList.updatePosition(3,100);
        myList.printList();
     }
}