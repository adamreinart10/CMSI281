//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 13, 2018
//Purpose: The purpose of this is to implement a CircularList

public class CircularListTester {
    public static void main( String[] args ) {
        CircularList myList = new CircularList();
System.out.println("*********************** Inserting ....");

        myList.insertVal( 23 );
        myList.insertVal( 19 );
        myList.insertVal( 17 );
        myList.insertVal( 13 );
        myList.insertVal( 11 );
        myList.insertVal( 7 );
        myList.insertVal( 5 );
        myList.insertVal( 3 );
        myList.insertVal( 2 );
        myList.display();

System.out.println("*********************** Deleting (2,3,23 ) ....");

        myList.deleteVal(2);
        myList.deleteVal(3);
        myList.deleteVal(23);
        myList.display();  // 19, 17, 13, 11, 7, 5

System.out.println("*********************** searching ....");

        System.out.println("Zero index: " + myList.searchAt(0));   // 19
        System.out.println("One index: " + myList.searchAt(1));   // 17
        System.out.println("Two index: " + myList.searchAt(2));   // 13
        System.out.println("Three index: " + myList.searchAt(3)); //11
        System.out.println("Four index: " + myList.searchAt(4));   // 7
        System.out.println("Five index: " + myList.searchAt(5) + "\n");   // 5

System.out.println("*********************** Stepping ....");
        CircularList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 19
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 17
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 13
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );
        myIt = myList.getIteratorAt( 3 );   // 11
        System.out.println( "Current Node is: " + myIt.getCurrentInt() ); // 11
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 7
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 5
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 19 circle
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 17
        myIt.step();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   // 13
    }
}
