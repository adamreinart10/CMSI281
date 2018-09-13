/************************************************************************/
   /* File Name:  IntListInterface.java                                                 *
   /* Project: ClassAsignment3
   /* Date: 9/12/2018
   /* Author: Adam Reinart                                  *
   /* Language:   Java                    *
   /*                         *                                       *
   /*                                                                      *
   /* Description:   The purpose of this is to get more familiar with java
   /*                and arrays by implementing a few more methods to the
   /*                given code in class. *
   /*     *
   /************************************************************************/
public interface IntListInterface {
     int getValueAtIndex( int index );
     boolean append( int valueToAdd );
     boolean insertValueAtIndex( int value, int index );
     int removeValueAtIndex( int index );
     public boolean CheckIndex(int index);
     public boolean prepend(int valueToAdd);
  }
