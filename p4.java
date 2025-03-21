import java.util.Scanner;

// Time complexity O(n)

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveFactorial(n));
        sc.close();
    }

    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}
