//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 17, 2018
//Purpose: The purpose of this file is to implement a circular list into the Josephus Game
public class Josephus {
    private Node current;
    private int size;

    public Josephus() {
        current = null;
        size = 0;
    }
//*******************************************************
    private class Node {            //declare node
        int data;
        Node next;
        Node( int d ) {
           data = d;
           next = null;
        }
   }

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

   public Iterator getIteratorAt( int index ) {
        Iterator it = new Iterator();
        while( index > 0 ) {
           it.step();
           index--;
        }
        return it;
      }
//************************************************** Methods for Roulette
    public void insertVal(int value){  //insertion
       //declare Node
       Node insert = new Node(value);
         if(size == 0){
             current = insert;
             insert.next = insert;
         }
         else {
           //declare it
           Iterator inserter = getIteratorAt(size-1);
           inserter.currentNode.next = insert;
           insert.next= current;
         }
            size++;
     }

     public int searchIndex(int index) {
         if (size == 0) {
             throw new IllegalArgumentException("empty");
         }
         Iterator searchAtIndex = getIteratorAt(index);
         return searchAtIndex.getCurrentInt();
     }
//*************************************************

//*************************************************
    public String roulette(int circleSize, int countOff) {
        Josephus myList = new Josephus();
        for (int i = 1; i <= circleSize; i++) {
            myList.insertVal(i);
            myList.size++;
        }
        String Out = "Numbers that are out of the Circle: ";
        String End = "The circle size is: " + circleSize + ".\nWe are counting off by : " + countOff + ".\nLast Number in the circle: ";
        Iterator rouletter = myList.getIteratorAt(0);
        while (myList.size > 2) {
                for (int j = 0; j < countOff; j++) {
                    for (int k = 0; k < circleSize; k++) {
                        if (rouletter.getCurrentInt() == 0) {
                        rouletter.step();
                        }
                    }
                    if (j == (countOff - 1)) {
                        Out += (rouletter.getCurrentInt() + " ");
                        rouletter.currentNode.data = 0;
                        myList.size--;
                        rouletter.step();
                    } else {
                        rouletter.step();
                    }
                }
                myList.size--;
        }
        if (myList.size == 2) {
            for (int i = 0; i < circleSize; i++) {
                if (myList.searchIndex(i) != 0) {
                    System.out.println((End += myList.searchIndex(i)));
                }
            }
        }
        return Out;
    }
}
