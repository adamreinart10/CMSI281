/************************************************************************/
   /* File Name:  IntQueue.java                                                 *
   /* Project: Classwork05
   /* Date: 9/26/2018
   /* Author: Adam Reinart                                  *
   /* Language:   Java                    *
   /*                         *                                       *
   /*                                                                      *
   /* Description:   The purpose of this is to get more familiar with java
   /*                and transitioning a piece of code for stacks to queues *
   /*     *
   /************************************************************************/

public class IntQueue {


  IntLinkedList myQueue;

  IntQueue() {
    myQueue = new IntLinkedList();         // constructor
  }

  public void enQueue( int itemToenQueue ) {
    myQueue.prepend(itemToenQueue);
  }
public int peek() {
    int length = myQueue.getSize() - 1;
    return myQueue.getIteratorAt(length).getCurrentInt();     // we use the iterator
  }

  public void deQueue() {
    int length = myQueue.getSize() - 1;
    if (myQueue.getSize() == 0){
      throw new IllegalArgumentException("Queue is empty!");
    }
    myQueue.removeAt(length);
  }

  public static void main( String[] args ) {
       IntQueue testQueue = new IntQueue();
       testQueue.enQueue( 19 );
       testQueue.enQueue( 23 );
       testQueue.enQueue( 29 );
       testQueue.enQueue( 31 );
       testQueue.enQueue( 37 );
       testQueue.enQueue( 41 );
       testQueue.enQueue( 43 );
       testQueue.enQueue( 47 );
       testQueue.enQueue( 51 );
       testQueue.enQueue( 57 );
       System.out.println( "The top of the queue: " + testQueue.peek() );      // 57
       testQueue.deQueue();
       //System.out.println( "Removing top thing: " + testQueue.pop() );         // 57 removed
       System.out.println( "The top of the queue: " + testQueue.peek() );      // 51
       testQueue.deQueue();
       //System.out.println( "Removing top thing: " + testQueue.pop() );         // 51 removed
       System.out.println( "The top of the queue: " + testQueue.peek() );      // 47
       testQueue.deQueue();
       //System.out.println( "Removing top thing: " + testQueue.pop() );         // 47 removed
       System.out.println( "The top of the queue: " + testQueue.peek() );      // 43
       testQueue.deQueue();
       //testQueue.pushd( testQueue.pop() + testQueue.pop() );
       System.out.println( "The top of the queue: " + testQueue.peek() );      // what'll it be?
       testQueue.deQueue();

       System.out.println( "The top of the queue: " + testQueue.peek() );      // what'll it be?
       testQueue.deQueue();

       System.out.println( "The top of the queue: " + testQueue.peek() );      // what'll it be?
       testQueue.deQueue();
 }
}
