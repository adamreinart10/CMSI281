
// File Name:  Simon.java                                                 *
// Project: Homework 3
//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: November 6, 2018
//Purpose: This is a class that Implements the Simon Says Game through the I/O



import java.util.Scanner;
import java.lang.Thread;
import java.util.Random;

public class Simon {

  private Node head;
  private int size;
  private String red = "R";
  private String blue = "B";
  private String green = "G";
  private String yellow = "Y";
  private Simon.Iterator current;
  private String[] simon = {red, blue, green, yellow};

  public Simon(){
    head = null;
    size = 0;
  }

  public String randomDisk(){
    Random rand = new Random();
    int randInt = rand.nextInt(4);
    return simon[randInt];
  }

  public int getSize() {
    return size;
  }

  public void prepend( String dataToAdd ) {
    Node currentHead = head;
    head = new Node( dataToAdd );
    head.next = currentHead;
    size++;
  }

  public Iterator getIteratorAt( int index ) throws IllegalArgumentException {
    if ((index > size) || (index < 0)) {
      throw new IllegalArgumentException();
    }
    Iterator it = new Iterator();
    while( index > 0) {
      it.next();
      index--;
    }
    return it;
  }

  private class Node {
     String data;
     Node next;


     public Node( String s) {
       data = s;
       next = null;
     }
  }

  public class Iterator {
     private Node currentNode;

     public Iterator() {
       currentNode = head;
     }

     public void next() {
       if (currentNode == null) {
         return;
       }
       else {
         currentNode = currentNode.next;
       }
     }

     public boolean hasNext() {
       return ((currentNode != null) && (currentNode.next != null));
     }

     public String getCurrentString() {
       return currentNode.data;
     }
  }



  public static void main(String[] args){
    Simon game = new Simon();
    System.out.println("Greetings! This is Simon Says!\n");
    System.out.println("First disk:");
    game.prepend(game.randomDisk());
    Simon.Iterator myIt = game.getIteratorAt(0);
    System.out.print(myIt.getCurrentString());
    try {
      Thread.sleep(1000);
    }
    catch(InterruptedException e) {
      Thread.currentThread().interrupt();
    }
    System.out.print("\b");
    System.out.println(" ");
    System.out.println("Print what Simon Says below!");
    Scanner input = new Scanner(System.in);
    String response = input.nextLine();
    if (response == myIt.getCurrentString() + "\n") {
      System.out.println("Congratulations, here is the next sequence!");
    }
    else {
      System.out.println("Game over. Play again! ");
      System.exit(0);
    }
    }
  }
