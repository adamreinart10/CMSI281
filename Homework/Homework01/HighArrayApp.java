/************************************************************************/
   /* File Name:  HighArrayApp.java                                                 *
   /* Project: Homework01
   /* Date: 9/19/2018
   /* Author: Adam Reinart                                  *
   /* Language:   Java                    *
   /*                         *                                       *
   /*                                                                      *
   /* Description:   The purpose of this is to get more familiar with java
   /*                and arrays by implementing a few more methods to the
   /*                given code in the textbook *
   /*     *
   /************************************************************************/
class HighArrayApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      HighArray arr;                // reference to array
      arr = new HighArray(maxSize); // create the array

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(55);
      arr.insert(130);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(66);
      arr.insert(66);
      arr.insert(66);
      arr.insert(33);
      arr.insert(55);

      arr.display();                // display items

      int searchKey = 35;           // search for item
      if( arr.find(searchKey) )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can't find " + searchKey);

      arr.delete(00);               // delete 4 items
      arr.delete(44);
      arr.delete(99);
      arr.delete(66);



      arr.display();                // display items again

      System.out.println("Max value: " + arr.getMax());
      arr.noDups();
      System.out.println("New Array: ");
      arr.display();
      }
   }
