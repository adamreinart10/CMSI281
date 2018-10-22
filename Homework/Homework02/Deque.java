//Rediet Teferi and Adam Reinart
// October 15, 2018
/* This Java file takes a dequeue and displays the contents
 of the dequeue */

class Deque {
  private int maxSize;
  private long[] dequeArray;
  private int leftAr;
  private int rightAr;
  private int nItems;

  public void contentDequeDisplayer(){
    for (int i = 0 ;i < nItems;i++){
      System.out.print(dequeArray[(leftAr + i) % nItems]);
    }
  }

  public Deque(int s){ // constructor

    maxSize = s;
    dequeArray = new long[maxSize];
    leftAr = 0;
    rightAr = 0;
    nItems = 0;
  }
  public void insertLeft(long j){ // put item at the rightAr of dequeue
    if(leftAr == maxSize - 1) // deal with wraparound
      leftAr = 0;
    if (leftAr == maxSize) {
      removeLeft();
    }
    dequeArray[++leftAr] = j; // increment to rightAr and insert
    nItems++; // one more item
  }
  public long removeLeft(){ // take item from leftAr of queue
    long temp = dequeArray[leftAr++]; // get value and increment leftAr
    if(leftAr == maxSize) // deal with wraparound
      leftAr = 0;
    nItems--; // one less item
    return temp;
  }
  public void insertRight(long j){ // put item at the rightAr of dequeue
    if(rightAr == maxSize - 1) // deal with wraparound
      rightAr = -1;
    dequeArray[++rightAr] = j; // increment to rightAr and insert
    nItems++; // one more item
  }
  public long removeRight(){ // take item from leftAr of queue
    long temp = dequeArray[rightAr--]; // get value and increment leftAr
    if(rightAr == 0) // deal with wraparound
      rightAr = maxSize - 1;
    nItems--; // one less item
    return temp;
  }
  public long peekleftAr(){ // peek at leftAr of queue
    return dequeArray[leftAr];
  }
  public boolean isEmpty(){ // true if queue is empty
    return (nItems==0);
  }
  public boolean isFull(){ // true if queue is full
    return (nItems==maxSize);
  }
  public int size(){ // number of items in queue
    return nItems;
  }
}
