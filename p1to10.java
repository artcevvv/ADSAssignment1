package adsassignment1;
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
                case 1: 
                    System.out.println("Enter array size:");
                    int n = sc.nextInt();
                    int[] array = new int[n];
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextInt();
                    }
                    System.out.println(recursiveMinimum(array, 0, Integer.MAX_VALUE)); 
                    break;
                case 2: 
                    System.out.println("Enter array size:");
                    n = sc.nextInt();
                    array = new int[n];
                    System.out.println("Enter " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        array[i] = sc.nextInt();
                    }
                    System.out.println(recursiveAverage(array, 0, 0) / (float)n); 
                    break;
                case 3: 
                    System.out.println("Enter a number:");
                    System.out.println(recursiveIsPrime(sc.nextInt(), 2) ? "Prime" : "Not prime"); 
                    break;
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
                    System.out.println(recursivePower(sc.nextInt(), sc.nextInt())); 
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Enter string:");
                    permutations(sc.nextLine()); 
                    break;
                case 8:
                    sc.nextLine();
                    System.out.println("Enter string:");
                    System.out.println(recursiveIsFullDigits(sc.nextLine(), 0) ? "Yes" : "No"); 
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
    public static int recursiveMinimum(int[] array, int index, int min) {
        if (index == array.length) {
            return min;
        }
        return recursiveMinimum(array, index + 1, Math.min(min, array[index]));
    }

    // Exercise 2: O(n)
    public static int recursiveAverage(int[] array, int index, int sum) {
        if (index == array.length) {
            return sum;
        }
        return recursiveAverage(array, index + 1, sum + array[index]);
    }

    // Exercise 3: O(sqrt(n))
    public static boolean recursiveIsPrime(int num, int divisor) {
        if (divisor > Math.sqrt(num)) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return recursiveIsPrime(num, divisor + 1);
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
    public static int recursivePower(int a, int n) {
        if (n == 0) return 1;
        return a * recursivePower(a, n - 1);
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
    public static boolean recursiveIsFullDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        return Character.isDigit(s.charAt(index)) && recursiveIsFullDigits(s, index + 1);
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
