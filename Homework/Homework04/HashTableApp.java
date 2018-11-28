// File Name: HashTableApp.java                                                 
// Project: Homework 4
// Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
// Date: November 26, 2018
// Purpose: This is a class which serves as a tester to test HashTable.java

import java.io.*;
import java.util.Random;

class HashTableApp{
  public static void main(String[] args) throws IOException {
    String[] animals = {"snake" , "moose" , "horse" , "lion" , "bird" , "cat", "dolphin"};
    Elements anElement;
    int n, keysPerCell;
    int size = 10000;
    String aKey;

   System.out.print("Please enter the desired size of the hash table: ");
    size = getInt();
    System.out.print("Now enter the initial number of elements/items: ");
    n = getInt();
    keysPerCell = 10;
    Random rand = new Random();

    HashTable theHashTable = new HashTable(size);
    for(int i=0; i<n; i++) {
      aKey = animals[rand.nextInt(7)];
      anElement = new Elements(aKey);
      theHashTable.insert(anElement);
    }
    while(true){
      System.out.print("Enter first letter of");
      System.out.print("show, insert, delete, or find: ");
      char option = getChar();
      switch(option){
        case 's':
          theHashTable.displayTable();
          break;
        case 'i':
          System.out.print("Enter key value to insert: ");
          aKey = getString();
          anElement = new Elements(aKey);
          theHashTable.insert(anElement);
          break;
        case 'd':
          System.out.print("Enter key value to delete: ");
          aKey = getString();
          theHashTable.delete(aKey);
          break;
        case 'f':
          System.out.print("Enter key value to find: ");
          aKey = getString();
          anElement = theHashTable.find(aKey);
          if(anElement != null){
            System.out.println("Found " + aKey + "!");
          }
          else
            System.out.println("Sorry, the system could not find " + aKey + ".");
            break;
        default:
        System.out.print("Invalid entry\n");
      } 
    } 
  }

  public static String getString(){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }

  public static char getChar(){
    String s = getString();
    return s.charAt(0);
  }

  public static int getInt(){
    String s = getString();
    return Integer.parseInt(s);
  }
  
}
