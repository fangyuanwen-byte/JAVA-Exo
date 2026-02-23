package job04;

import java.util.Scanner;

public class Job04_Dice {
    static void main(String[] args) {
        diceGame();
    }
    static void diceGame() {
        System.out.println("Dice Game Started: Press Enter to play.");
        Scanner sc = new Scanner(System.in);
        String start=sc.nextLine();
            if(start.isEmpty() ){
                int dice1= (int) (Math.random()*6+1);
                int dice2=(int)(Math.random()*6+1);
                System.out.println("Dice 1: "+dice1+" Dice 2: "+dice2);
            }else {
                System.out.println("Invalid Input");}
    }

}

