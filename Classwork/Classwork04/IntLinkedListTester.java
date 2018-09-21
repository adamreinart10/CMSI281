/************************************************************************/
   /* File Name:  IntLinkedListTester.java                                                 *
   /* Project: Classwork4
   /* Date: 9/20/2018
   /* Author: Adam Reinart                                  *
   /* Language:   Java                    *
   /*                         *                                       *
   /*                                                                      *
   /* Description:   The purpose of this is to get more familiar with java
   /*                and lists and deques by implementing a few more methods to the
   /*                given code in the textbook *
   /*     *
   /************************************************************************/

public class IntLinkedListTester {

      public static void main( String[] args ) {
         IntLinkedList myList = new IntLinkedList();
         myList.prepend( 23 );
         myList.prepend( 19 );
         myList.prepend( 17 );
         myList.prepend( 13 );
         myList.prepend( 11 );
         myList.prepend(  7 );
         myList.prepend(  5 );
         myList.prepend(  3 );
         myList.prepend(  2 );
         myList.insertAt(6,3);
         myList.removeAt(5);
         IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt = myList.getIteratorAt( 3 );
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 19
         myIt.next();
         System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23

      }
   }
