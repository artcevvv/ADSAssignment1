import java.util.Scanner;

public class p1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose an exercise (1-10) or 0 to exit:");
            System.out.println("1. Find minimum number");
            System.out.println("2. Calculate average");
            System.out.println("3. Check if number is prime");
            System.out.println("4. Calculate factorial");
            System.out.println("5. Calculate Fibonacci number");
            System.out.println("6. Calculate power");
            System.out.println("7. Generate string permutations");
            System.out.println("8. Check if string contains only digits");
            System.out.println("9. Calculate binomial coefficient");
            System.out.println("10. Calculate GCD");
            System.out.println("0. Exit");
            
            int choice = sc.nextInt();
            if (choice == 0) break;
            
            switch (choice) {
                case 1: minimum(); break;
                case 2: avg(); break;
                case 3: isPrime(); break;
                case 4: 
                    System.out.println("Enter n:");
                    System.out.println(recursiveFactorial(sc.nextInt())); 
                    break;
                case 5:
                    System.out.println("Enter n:");
                    System.out.println(fibRecursion(sc.nextInt())); 
                    break;
                case 6:
                    System.out.println("Enter base and exponent:");
                    System.out.println(power(sc.nextInt(), sc.nextInt())); 
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Enter string:");
                    permutations(sc.nextLine()); 
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Enter string:");
                    isFullDigits(sc.nextLine()); 
                    break;
                case 9:
                    System.out.println("Enter n and k:");
                    System.out.println(binomial(sc.nextInt(), sc.nextInt())); 
                    break;
                case 10:
                    System.out.println("Enter two numbers:");
                    System.out.println(gcd(sc.nextInt(), sc.nextInt())); 
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
        sc.close();
    }

    // Exercise 1: O(n)
    public static int minimum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] array = new int[n];
        int temp = Integer.MAX_VALUE;
        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        
        return temp;
    }

    // Exercise 2: O(n)
    public static void avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }

        float average = (float) sum / n;
        System.out.println(average);
    }

    // Exercise 3: O(sqrt(n))
    public static void isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
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

    // Exercise 4: O(n)
    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    // Exercise 5: O(2^n)
    public static int fibRecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    // Exercise 6: O(n)
    public static int power(int a, int n) {
        int res = 1;
        if (n == 0) return 1;
        while (n > 0) {
            res *= a;
            n -= 1;
        }
        return res;
    }

    // Exercise 7: O(n!)
    public static void permutations(String str) {
        permutationsHelper("", str);
    }
    
    private static void permutationsHelper(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }
        
        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permutationsHelper(newPrefix, newRemaining);
        }
    }

    // Exercise 8: O(n)
    public static void isFullDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    // Exercise 9: O(2^n)
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }

    // Exercise 10: O(log(min(a,b)))
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
