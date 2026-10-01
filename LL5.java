public class LL5{
    //print link list or traverse link list

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

    private void tranversal(){
        node temp = head;
         while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
         }
    }

    public static void main(String[] args) {
        LL5 myList = new LL5();
        myList.tranversal();
    }
}