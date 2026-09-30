public class LL4 {
//insert at position
    static class node{
        int data;
        node next;

        node (int data){
           this.data = data;
           this.next = null;

        }
    }
    private node head;
    private node tail;
    private int size;

    private void insertAtPosition(int position, int data){
        if(position < 1 || position > size+1){
            return ;
        }
        // if(position == 1){
           //use insertAtHead 
        // }
        //if(position == size +1){
        // use insertAtTail    
  //  }

        node prevnode = head;
        for(int i = 1; i<= position-2; i++){
            prevnode = prevnode.next;
        }

        node newnode = new node(data);
        newnode.next = prevnode.next;
        prevnode.next = newnode;

        size++;

        
    }
}
