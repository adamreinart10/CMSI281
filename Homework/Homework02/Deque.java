//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 13, 2018
//Purpose: The purpose of this is to implement a Deque

 public class Deque {
     private int max;
     private int start;
     private int end;
     private int nItems;
     private long[] Array;


     public Deque( int size ) {
         max = size;
         start = 0;
         end = -1;
         nItems = 0;
         Array = new long[max];
     }

     //insert at start of array
     public void insertLeft( long j ) {
         if ( start == 0 ) {
             start = max;
         }
         Array[--start] = j;
         nItems++;
     }

     //insert at end of array
     public void insertRight( long j ) {
         if ( end == max - 1 ) {
             end = -1;
         }
         Array[++end] = j;
         nItems++;
     }

     //Removes from the start
     public long removeLeft() {
         long temporary = Array[start++];
         if ( start == max ) {
             start = 0;
         }
         nItems--;
         return temporary;
     }

     //removes item at end
     public long removeRight() {
         long temporary = Array[end--];
         if ( end == -1 ) {
             end = max-1;
         }
         nItems--;
         return temporary;
     }


     public boolean isEmpty() {
         return ( nItems == 0 );
     }


     public boolean isFull() {
         return ( nItems == max );
     }


     public void displayDequeue() {
         int index = start;
         for ( int i = 0; i < nItems; i++ ) {
             System.out.print( Array[index] + " " );
             if ( index == max - 1 ) {
                 index = 0;
             }
             else {
                 index++;
             }
         }
         System.out.println();
     }
   }
