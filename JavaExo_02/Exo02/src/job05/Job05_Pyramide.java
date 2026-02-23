package job05;

public class Job05_Pyramide {
    static void main(String[] args) {
        pyramide(5);
    }
    static void pyramide(int m){

        for(int i=0;i<m;i++){
            for(int j=m-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

