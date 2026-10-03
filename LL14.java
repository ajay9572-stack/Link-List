public class LL14 {
    // all function in one
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

 //insert at head
         private void insertAtHead(int data){
        node newNode = new node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
      }
//insert at tail

              private void insertAttail(int data){
        node newNode = new node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
       }
//insert at position
       private void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        node prevnode = head;
        for (int i = 1; i <= position - 2; i++) {
            prevnode = prevnode.next;
        }
        node newnode = new node(data);
        newnode.next = prevnode.next;
        prevnode.next = newnode;
        size++;
    }
//search in list
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

// search the position and return the position
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
    
//update position
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

//update old value to new value
       private void updateValue(int oldVlaue, int newVale){
        node temp = head;
        while (temp != null) {
            if(temp.data == oldVlaue){
                temp.data = newVale;
            }
            temp = temp.next;
        }
    }

//Delete head
        public void deleteHead(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
          head = head.next;
          size--;

          if(head == null){
            tail = null;
          }
    }
   
//Delete tail
    public void deleteTail(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
    if(head == tail){
        head = null;
        tail = null;
        size = 0;
        return;
    }
    node temp = head;
    for(int i = 0; i < size - 2; i++){
        temp = temp.next;
    }
    temp.next = null;
    tail = temp;
    size--;
}

//DElete position
      private void deleteAtPosition(int position) {
        if (position < 1 || position > size + 1) {
            return;
        }
          if(position == 1){
            //delete head
            return ;
          }
          if(position == size){
            //delete tail
            return ;
          }
          node previous =head;
          for(int i= 0;i<= position-2; i++){
            previous = previous.next;
          }
          node current =  previous.next;
          node forward = current.next;

          previous.next = forward;
          current.next = null;

          size--;
    }

//delete at value; find target if get then delete them
         private boolean deleteValue( int target){
       if(head == null){
        System.out.println("delete not possible");
        return false;
       }
       if(head.data == target){
        //delete head
        return true;
       }
 
       node prev = head;
       node current = head.next;

       while (current != null) {
        if(current.data ==target){
            node forward = current.next;
            prev.next = forward;
            current.next = null;

            if(tail == current){
                tail = prev;
            }
            size--;
            return true;
        }else{
            prev = prev.next;
            current = current.next;
        }
       }

       return false;
    }

//DIsplay the data
    private void printList(){
            node temp = head;
            while(temp != null){
               System.out.print(temp.data +" ");
               temp = temp.next;
            }
        }
    public static void main(String[] args) {
        LL14 myList = new LL14();
        myList.insertAtHead(10);
        myList.insertAtHead(20);
        myList.insertAtHead(30);
        myList.insertAtHead(40);
        myList.insertAtHead(50);
        myList.insertAtHead(60);
        // myList.printList();

        myList.insertAttail(200);
      //  myList.printList();

        myList.insertAtPosition(3,500);
      //  myList.printList();


      //   System.out.println();
     //   System.out.print(myList.searchList(2000));


     //    System.out.println();
     //   System.out.print(myList.searchPosition(200));


        myList.updatePosition(3,1000);
     //    myList.printList();
     

        myList.updateValue(1000, 8000);
     //   myList.printList();

         myList.deleteHead();
     //   myList.printList();

        myList.deleteTail();
     //   myList.printList();
       
        myList.deleteAtPosition(3);
     //   myList.printList();
     
        myList.deleteAtPosition(3);
     //   myList.printList();

    }    
}
