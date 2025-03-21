import java.util.Scanner;

// Time Complexity O(n)

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();
        
        sc.close();

        System.out.println(power(a, n));
    }

    public static int power(int a, int n) {
        int res = 1; 
        
        if (n == 0) {
            return 1;
        }

        while (n > 0) { // loop called n times => O(n)
            res *= a;
            n -= 1;
        }

        return res;
    }
}
