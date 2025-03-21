package adsassignment1;
import java.util.Scanner;

// Time complexity is O(2^n)

public class p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(binomial(n, k));
    }

    // Double calling recursive function
    public static int binomial(int n, int k) {
        if(k == 0 || k == n) {
            return 1;
        }

        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
}
