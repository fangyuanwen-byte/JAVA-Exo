package job06;

import java.util.Scanner;

public class Job06 {
    static void main(String[] args) {
        diamond(5);
    }

    static void diamond(int m){
        int h=2*m;
        for(int i=0;i<m;i++){
            for(int j=m-i;j>1;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int a=m;a<2*m;a++){
            for(int b=0;b<=a-m;b++){
                System.out.print(" ");
            }
            for (int c=2*m-1-a;c>=1;c--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
