import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int n = in.nextInt();
        patternPrinter(n);
    }

    static void patternPrinter(int n) {
        // write your code here
        for(int i = n; i > 0; i--){
            for(int j = n; j > 0; j--){
                int k = 0;
                while(k < i){
                    System.out.print(j + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}