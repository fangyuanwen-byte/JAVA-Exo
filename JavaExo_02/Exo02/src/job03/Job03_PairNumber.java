package job03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Job03_PairNumber {
    static void main(String[] args) {
        NumberPairs();
    }

    public static void NumberPairs() {
        int a = 0;
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            if (a % 2 == 0) {
                System.out.println("the " + counter + " pair number is " + a);
            }
            a++;
            counter++;
        }
    }
}

