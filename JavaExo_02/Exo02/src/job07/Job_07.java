package job07;


import java.util.Scanner;

public class Job_07 {
    static void main(String[] args) {
        diceGamePlus();
    }
    static void diceGamePlus(){
        System.out.println("Enter S to play the dice game:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counter = 0;
        int numR;
        if (s.equalsIgnoreCase("s")) {
            long statTime = System.nanoTime();
            do {
                numR = (int) (Math.random() * 2000000 + 1);
                counter ++;
            } while (numR != 6);
            double duration = (double) (System.nanoTime() - statTime) /1000000;
            System.out.println("The time been used for dice of 6 is :"+ duration+"ms.");
            System.out.println("Total random number generated before having 6 is :"+ counter);
        }

    }
}

