import java.util.Scanner;

// O(n)

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        isFullDigits(s);
    }

    public static void isFullDigits(String s) {         // Works dependent only on the length of the string
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
            }
        }

        System.out.println("Yes");
    }
}
