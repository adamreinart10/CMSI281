// File Name:  PriorityQ.java                                                 *
// Project: Homework 4
//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: November 27, 2018
//Purpose: The purpose of this is to implement a PriorityQueue


import java.util.*;
class PriorityQ {

  private int maxSize;
  private Heap queHeap;

public PriorityQ(int s) {
  maxSize = s;
  queHeap = new Heap(maxSize);
}

public int size(){
  return queHeap.getSize();
}

public void insert(int item) {
  queHeap.insert(item);
}

public int remove()
{
  return queHeap.getNodeKey(queHeap.remove());
}

public long peekMin()
{
  return queHeap.findMin();
}

public boolean isEmpty()
{
  return queHeap.getSize() == 0;
}

public boolean isFull()
{
  return queHeap.getSize() == maxSize;
}

public void displayQueue(){
  int[] nQueue = new int[queHeap.getSize()];
  for(int i = 0; i < queHeap.getSize(); i++){
    nQueue[i] = queHeap.getNodeKey( queHeap.getArray()[i]);
  }
  Arrays.sort( nQueue );
  for(int i = queHeap.getSize()-1; i >= 0; i --){
    System.out.print( nQueue[i] + " " );
  }
}

public static void main( String args[] ){
  PriorityQ priQueue = new PriorityQ( 10 );
        System.out.println( "insert method" );
        priQueue.insert( 10 );
        priQueue.insert( 20 );
        priQueue.insert( 40 );
        priQueue.insert( 72 );
        priQueue.insert( 36 );
        priQueue.insert( 29 );
        System.out.print("Display Queue: ");
        priQueue.displayQueue();

        System.out.println( "\nremove method" );
        System.out.println( "Remove: " + priQueue.remove() );
        System.out.println( "Remove: " + priQueue.remove() );
        System.out.println( "Remove: " + priQueue.remove() );
        System.out.println( "Remove: " + priQueue.remove() );
        System.out.println( "Remove: " + priQueue.remove() );
        System.out.print("Display Queue: ");
        priQueue.displayQueue();

       System.out.println( "\npeekMin method" );
       priQueue.insert( 16 );
       priQueue.insert( 30 );
       priQueue.insert( 28 );
       priQueue.insert( 95 );
       priQueue.insert( 46 );
       priQueue.insert( 58 );
       System.out.print("Display Queue: ");
       priQueue.displayQueue();
       System.out.print( "\nFind Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print( "Find Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print( "Find Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print( "Find Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print( "Find Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print( "Find Min: " + priQueue.peekMin() + " " );
       System.out.println( "Remove: " + priQueue.remove() + " " );
       System.out.print("Display Queue: ");
       priQueue.displayQueue();



       System.out.println( "\nisEmpty method" );
       priQueue.insert( 13 );
       priQueue.insert( 83 );
       priQueue.insert( 45 );
       System.out.print("Display Queue: ");
       priQueue.displayQueue();
       System.out.println( "\nEmpty? " + priQueue.isEmpty()  );
       priQueue.remove();
       System.out.println( "Empty? " + priQueue.isEmpty()  );
       priQueue.remove();
       System.out.println( "Empty? " + priQueue.isEmpty()  );
       priQueue.remove();
       System.out.println( "Empty? " + priQueue.isEmpty() );
       priQueue.remove();
       System.out.println( "Empty? " + priQueue.isEmpty() );



       System.out.println( "\nisFull method" );
       priQueue.insert( 20 );
       priQueue.insert( 38 );
       System.out.print("Display Queue: ");
       priQueue.displayQueue();
       System.out.println( "\nFull? " + priQueue.isFull() );
       priQueue.insert( 69 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 16 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 48 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 20 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 99 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 60 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 40 );
       System.out.println( "Full? " + priQueue.isFull() );
       priQueue.insert( 25 );
       System.out.println( "Full? " + priQueue.isFull() );
       System.out.print("Display Queue: ");
       priQueue.displayQueue();

}
}
