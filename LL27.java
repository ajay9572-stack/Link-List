public class LL27 {
// all doubly link list code in oe
    static class node {
        int data;
        node prev;
        node next;

        node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    // insert at head
    private void insertAtHead(int data) {
        node newNode = new node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // insert at tail
    private void insertAtTail(int data) {
        node newNode = new node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // insert at position
    private void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        node previous = head;
        for (int i = 1; i <= position - 2; i++) {
            previous = previous.next;
        }
        node current = new node(data);
        node forward = previous.next;
        previous.next = current;
        current.prev = previous;
        current.next = forward;
        forward.prev = current;

        size++;
    }

    // search in list
    private boolean searchList(int target) {
        node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // search position
    private int searchPosition(int target) {
        node temp = head;
        int position = 1;

        while (temp != null) {
            if (temp.data == target) {
                return position;
            }
            temp = temp.next;
            position++;
        }

        return -1;
    }

    // update position
    private void updatePosition(int position, int data) {
        if (position < 1 || position > size) {
            System.out.println("invalid position");
            return;
        }

        node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.data = data;
    }

    // update old value to new value
    private void updateValue(int oldValue, int newValue) {
        node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
            }
            temp = temp.next;
        }
    }

    // delete head
    private void deleteHead() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
    }

    // delete tail
    private void deleteTail() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }

    // delete at position
    private void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            return;
        }
        if (position == 1) {
            deleteHead();
            return;
        }
        if (position == size) {
            deleteTail();
            return;
        }
        node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        node previous = current.prev;
        node forward = current.next;

        previous.next = forward;
        forward.prev = previous;

        current.prev = null;
        current.next = null;

        size--;
    }

    // delete at value
    private boolean deleteValue(int target) {
        if (head == null) {
            System.out.println("delete not possible");
            return false;
        }
        if (head.data == target) {
            deleteHead();
            return true;
        }
        node current = head;
        while (current != null) {
            if (current.data == target) {
                if (current == tail) {
                    deleteTail();
                    return true;
                }
                node previous = current.prev;
                node forward = current.next;
                previous.next = forward;
                forward.prev = previous;
                current.prev = null;
                current.next = null;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // forward traversal
    private void forwardTraversal() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // backward traversal
    private void backwardTraversal() {
        node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // display data
    private void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

     public static void main(String[] args) {
        LL27 myList = new LL27();
        myList.insertAtHead(10);
        myList.insertAtHead(20);
        myList.insertAtHead(30);
        myList.insertAtHead(40);
        myList.insertAtHead(50);
        myList.insertAtHead(60);
     //    myList.printList();

        myList.insertAtTail(200);
     //   myList.printList();

        myList.insertAtPosition(3, 500);
     //   myList.printList();

      //  System.out.println(myList.searchList(200));

      //  System.out.println(myList.searchPosition(200));

        myList.updatePosition(3, 1000);
      //  myList.printList();

        myList.updateValue(1000, 8000);
     //   myList.printList();

        myList.deleteHead();
     //   myList.printList();

        myList.deleteTail();
      //  myList.printList();

        myList.deleteAtPosition(3);
     //   myList.printList();

        myList.deleteValue(500);
      //  myList.printList();

      //  System.out.println("Forward:");
     //   myList.forwardTraversal();

     //   System.out.println("Backward:");
        myList.backwardTraversal();
    }
}