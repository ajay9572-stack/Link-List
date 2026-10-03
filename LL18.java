public class LL18 {
//insert at position
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

    private void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            return;
        }
          if(position == 1){
            //use indert at head
            return ;
          } 
          if(position == size+1){
            //use insert at tail
            return;
          }
          node temp = head;
          node prevnode = temp;
          node nextNode = prevnode.next;
          node currentNode = new node(data);
        for (int i = 1; i <= position - 2; i++) {
           temp = temp.next;
        }
        currentNode.previous = prevnode;
        prevnode.next = currentNode;
        currentNode.next = nextNode;
        nextNode.previous = currentNode;

        size++;
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
        LL18 myList = new LL18();
        myList.insertAtPosition(5,200);
        myList.printList();
    }
}
