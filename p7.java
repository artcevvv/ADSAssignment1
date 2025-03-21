import java.util.Scanner;

// Time complexity O(n!)

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        permutations(s);
    }

    public static void permutations(String str) {
        permutationsHelper("", str);
    }
    
    // This function generate all possible combinations of the string, and it's N!, so complexity is O(n!)

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
}
