//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 13, 2018
//Purpose: This Java file takes a queue and displays the contents
// of the queue 
class QueueApp{
  public static void main(String[] args){

    Queue theQueue = new Queue(5);

    theQueue.insert(10);
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);

    theQueue.remove();
    theQueue.remove();
    theQueue.remove();

    theQueue.insert(50);
    theQueue.insert(60);
    theQueue.insert(70);
    theQueue.insert(80);

    while( !theQueue.isEmpty() ){
      long n = theQueue.remove(); // (40, 50, 60, 70, 80)
      System.out.print(n);
      System.out.print(" ");
    }

    System.out.println(" ");

    theQueue.contentDisplayer();
    }
}
