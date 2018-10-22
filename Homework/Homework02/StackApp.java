//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 13, 2018
//Purpose: The purpose of this is to implement a stack

public class StackApp {

      public static void main( String[] args ) {
        Stack newStack = new Stack();
        newStack.push(11);
        newStack.display(); //11
        newStack.push(22);
        newStack.display(); //11, 22
        newStack.push(33);
        newStack.display(); //11, 22, 33
        newStack.push(44);
        newStack.display(); //11, 22, 33, 44
        newStack.push(55);
        newStack.display();//11, 22, 33, 44, 55
        System.out.println("Top of stack:" + newStack.peek()); //11

        newStack.pop();
        newStack.display(); //11, 22, 33, 44
        newStack.pop();
        newStack.display(); //44, 22, 33
        newStack.pop();
        newStack.display(); //33, 22
        newStack.pop();
        newStack.display(); //22
        newStack.pop();
        newStack.display(); //throw empty
        newStack.push(66);
        newStack.display(); //66
        System.out.println("Top of stack:" + newStack.peek()); //66
        newStack.push(77);
        newStack.display(); //66, 77
        newStack.push(88);
        newStack.display();  //66, 77, 88
        newStack.push(99);
        newStack.display(); //66, 77, 88, 99
        System.out.println("Top of stack:" + newStack.peek()); //66
        newStack.pop();
        newStack.display(); //66, 77, 88
        newStack.pop();
        newStack.display(); //88, 77
        newStack.pop();
        newStack.display(); //77
        System.out.println("Top of stack:" + newStack.peek()); //77
      }
