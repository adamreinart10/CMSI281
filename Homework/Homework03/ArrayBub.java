// File Name:  ArrayBub.java                                                 *
// Project: Homework 3
//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: November 5, 2018
//Purpose: The purpose of this is to implement a oddEvenSort method


import java.io.*;

class ArrayBub {

private long[] a; // ref to array a
private int nElems; // number of data items
//--------------------------------------------------------------
public ArrayBub(int max) // constructor
{
  a = new long[max]; // create the array
  nElems = 0; // no items yet
}
//--------------------------------------------------------------
public void insert(long value) // put element into array
{
  a[nElems] = value; // insert it
  nElems++; // increment size
}
//--------------------------------------------------------------
public void display() // displays array contents
{
  for(int j=0; j<nElems; j++) // for each element,
    System.out.print(a[j] + " "); // display it
    System.out.println("");
}
//--------------------------------------------------------------
public void bubbleSort(){
int out, in;
for(out=nElems-1; out>1; out--) // outer loop (backward)
  for(in=0; in<out; in++) // inner loop (forward)
    if( a[in] > a[in+1] ) // out of order?
      swap(in, in+1); // swap them
} // end bubbleSort()
//--------------------------------------------------------------

private void swap(int one, int two){
  long temp = a[one];
  a[one] = a[two];
  a[two] = temp;
}

public void oddEvenSort()
    {
      int out, in;
      out=nElems;
      boolean isSorted = false;
      while (!isSorted){ // outer loop (backward)
        isSorted = true;
        for(in=1; in<=out-2; in=in+2){
          if( a[in] > a[in+1] ) { // out of order?
            swap(in, in+1); // swap them
            isSorted = false;
          }
        } // inner loop (forward)

        for(in=0; in<=out-2; in=in+2){
          if( a[in] > a[in+1] ) { // out of order?
            swap(in, in+1); // swap them
            isSorted = false;
          }
        } // inner loop (forward)
      }
  }

//--------------------------------------------------------------
} // end class ArrayBub

///////////////////////////////////////
