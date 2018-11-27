// File Name:  BinaryTreeNode.java                                                 *
// Project: Homework 3
//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: November 27, 2018
//Purpose: The purpose of this is to implement a in-order traverse method

public class BinaryTreeNode {

   private int data;
   private BinaryTreeNode left;
   private BinaryTreeNode right;

   BinaryTreeNode( int d ) {
       data = d;
       left = null;
       right = null;
   }

   public void add( int s, String child ) {
      child = child.toUpperCase();
      if( child.equals( "L" ) ) {
         left = new BinaryTreeNode( s );
      } else if( child.equals( "R" ) ) {
         right = new BinaryTreeNode( s );
      } else {
         throw new IllegalArgumentException();
      }
   }

   public BinaryTreeNode getChild( String child ) {
      child = child.toUpperCase();
      if( child.equals("L") || child.equals("R") ) {
         return (child.equals("L") ? left : right);
      } else {}
         throw new IllegalArgumentException();
      }

   public int getString() {
       return data;
   }

   public static void inOrderPrinter( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      inOrderPrinter( node.getChild( "L" ) );
      System.out.print( "[" + node.data + "]" );
      inOrderPrinter( node.getChild( "R" ) );
   }
}
