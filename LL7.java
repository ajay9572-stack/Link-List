public class LL7 {
    // search in the list and return position
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

    private int searchPosition( int target){
        node temp = head;
        int position = 1;
        while (temp != null) {
            if(temp.data == target){
              return position;
            }else{
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    private void printList(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LL7 myList = new LL7();
        System.out.println(myList.searchPosition(40));
    }
}
