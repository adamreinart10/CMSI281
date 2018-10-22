//Rediet Teferi and Adam Reinart
// October 15, 2018
/* This Java file takes a queue and displays the contents
 of the queue */

class Queue {
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int nItems;

  public void contentDisplayer(){
    for (int i = 0 ;i < nItems;i++){
      System.out.print(queArray[(front + i) % nItems]);
    }
  }

  public Queue(int s){ // constructor

    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }
  public void insert(long j) { // put item at rear of queue
    if(rear == maxSize - 1) // deal with wraparound
      rear = -1;
    queArray[++rear] = j; // increment rear and insert
    nItems++; // one more item
  }
  public long remove(){ // take item from front of queue
    long temp = queArray[front++]; // get value and increment front
    if(front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
  }
  public long peekFront(){ // peek at front of queue
    return queArray[front];
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
