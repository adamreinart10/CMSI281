// File Name: HashTable.java                                                 
// Project: Homework 4
// Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
// Date: November 26, 2018
// Purpose: This is a class that performs hash code all while being able to find, insert, and delete from the Hash Table

import java.io.*;

class Elements { 

  private String Elemental; 

  public Elements(String e) {
    Elemental = e;
  }

  public String getKey(){
    return Elemental;
  }

} 

class HashTable{

  private Elements[] hashArray; 
  private int arraySize;
  private Elements nullement; // elements not in array

  public HashTable(int size){

    arraySize = size;
    hashArray = new Elements[arraySize];
    nullement = new Elements(" -1 "); 
  }

  public void displayTable(){

    System.out.print(" Table: ");
    for(int i=0; i<arraySize; i++){
      if(hashArray[i] != null)
        System.out.print(hashArray[i].getKey() + " ");
      else
        System.out.print(" ** ");
    }
    System.out.println("");
  }

  public int hashFunc(String key){

     int hash = 0;
     int sum = 0;
    for (int i = 0; i < key.length(); i++){
      sum = (int) key.charAt(i) - 65;
      hash = hash + sum;
    }

    return hash;
  }

  public void insert(Elements element){

    String key = element.getKey(); 
    int hashVal = hashFunc(key); 
    while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != "-1"){
      ++hashVal;
      hashVal %= arraySize; /* wraps around ONLY IF needed */
    }
    hashArray[hashVal] = element; 
  }

  public Elements delete(String key){
    int hashVal = hashFunc(key); 
    while(hashArray[hashVal] != null) 
    { 
      if(hashArray[hashVal].getKey() == key){
        Elements temp = hashArray[hashVal]; 
        hashArray[hashVal] = nullement; 
        return temp; 
      }
    ++hashVal; 
    hashVal %= arraySize; /* used similar to how this is used in insert --> wraps around ONLY IF needed */
    }
    return null; 
  } 

  public Elements find(String key) // find element with key{
    int hashVal = hashFunc(key); 
    while(hashArray[hashVal] != null){ 
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal]; 
    ++hashVal; 
    hashVal %= arraySize; /* used similar to how this is used in insert() & delete() --> wraps around ONLY IF needed */
    }
    
    return null; 
  }

} 
