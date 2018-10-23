//Authors: Joshua Patterson & Rediet Teferi & Adam Reinart
//Date: October 17, 2018
//Purpose: The Purpose of this file is to provide the Josephus file with a tester to make sure Josephus works.

public class JosephusTester {
    public static void main( String[] args ) {
        Josephus myList = new Josephus();
//Inputs circleSize and countOff number

        System.out.println(myList.roulette(5, 1) + "\n");                 //There is a circle of: 5. We are counting off by : 1. Last # in the circle: 5
                                                                         //Out of the Circle are #'s ': 1 2 3 4


        System.out.println(myList.roulette(3, 3) + "\n");                 //There is a circle of: 3. We are counting off by : 3. Last # in the circle: 2
                                                                         //Out of the Circle are #'s ': 3 1


        System.out.println(myList.roulette(20, 4) + "\n");               // There is a circle of: 20. We are counting off by : 4. Last # in the circle: 17
                                                                        //Out of the Circle are #'s: 4 8 12 16 20 5 10 15 1 7 14 2 11 19 13 6 3 9 18


        System.out.println(myList.roulette(2, 2) + "\n");               // There is a circle of: 2. We are counting off by : 2. Last # in the circle: 1
                                                                       //Out of the Circle are #'s: 2


        System.out.println(myList.roulette(10, 10) + "\n");             // There is a circle of: 10. We are counting off by : 10. Last # in the circle: 8
                                                                       //Out of the Circle are #'s: 10 1 3 6 2 9 5 7 4
    }
}
