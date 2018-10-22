//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 13, 2018
//Purpose: The purpose of this is to implement a CircularList

public class CircularList {
    private Node current;
    private int  size;
//***************************************************
    public CircularList() {
        current = null;
        size = 0;
    }
//***************************************************
   private class Node {            //declare node
        int data;
        Node next;
        Node( int d ) {
           data = d;
           next = null;
        }
   }
//*****************************************************
   public class Iterator {              //declare iterator
        private Node currentNode;

        Iterator() {
           currentNode = current;
        }
        public void step() {
           if( currentNode == null ) {
              return;
           } else {
              currentNode = currentNode.next;
           }
        }
        public boolean hasNext() {
          return ((currentNode != null) && (currentNode.next != null));
        }

        public int getCurrentInt() {
          return currentNode.data;
        }
  }
//***********************************************
    public Iterator getIteratorAt( int index ) {
         if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         Iterator it = new Iterator();
         while( index > 0 ) {
            it.step();
            index--;
         }
         return it;
       }

     public int getInt()     {
           return current.data;
     }
     public int getNextInt() {
           return current.next.data;
     }
  //************************************************
     public void insertVal(int value){  //insertion
       //declare Node
       Node insert = new Node(value);
         if(size == 0){
             current = insert;
             insert.next = insert;
         }
         else {
           //declare it
           Iterator inserter = getIteratorAt(getSize()-1);
           inserter.currentNode.next = insert;
           insert.next= current;
         }
            size++;
     }
//*************************************************
    public int searchAt( int value ) {      //searching for value
            if (size==0) {
                  throw new IllegalArgumentException("empty");
            }
            //declare it
            Iterator searcher = getIteratorAt(value);
            return searcher.getCurrentInt();
    }

   public int search(int index) {           //searching for index (Used for josephus)
        if (size == 0) {
            throw new IllegalArgumentException("empty");
        }
        Iterator searchIndex = getIteratorAt(index);
        return searchIndex.getCurrentInt();
    }
//*************************************************
    public void step() {                  //again
           current = current.next;
           }

    public void deleteVal(int value) {       //specified value
        for ( int i = 0; i < size; i++ ) {
            if ( current.next.data == value ) {
            current.next = current.next.next;
           size--;
        }
           step();
        }
    }

//**************************************************
    public int removeNext() {            //arbitrary , used for stack
        Node currentNode = current;
              step();
        currentNode.next = current.next;
              int val = getInt();
                   step();
            size--;
            return val;
    }
 //********************************************
    public int getSize() {
           return size;
    }
//*************************************************
    public void display() {
        System.out.print("Circular List: ");
          for (int i = 0; i < size; i++){
              System.out.print(current.data + " ");
                current = current.next;
                }
                  System.out.println();
    }
}
