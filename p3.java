import java.util.Scanner;

// O(sqrt(n))

public class p3 {
    public static void main(String[] args) {
        isPrime();
    }

    public static void isPrime() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 2;
        
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i > Math.sqrt(num)) System.out.println("Prime");
        else System.out.println("Not prime");
    }
}
