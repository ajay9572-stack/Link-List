public class LL6 {
    // search in the list 
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
    private int data;

    private boolean searchList( int target){
        node temp = head;
        while (temp != null) {
            if(temp.data == target){
              return true;
            }else{
                temp = temp.next;
            }
        }
          return false;
    }
    private void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LL6 myList = new LL6();
        myList.searchList(40);
        myList.printList();
    }
}
