import java.util.Scanner;

// Time complexity O(2^n) due to the two recursive calls

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        sc.close();

        System.out.println(fibRecursion(n));
    }

    public static int fibRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        return fibRecursion(n - 1) + fibRecursion(n - 2) ;
    }
}
