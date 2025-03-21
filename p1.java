import java.util.Scanner;

// Time complexity O(n)

public class p1 {
    public static void main(String[] args) {
        int min = minimum();

        System.out.println(min);
    }

    public static int minimum() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // O(1)
        int[] array = new int[n]; // O(n) - init n-num array
        int temp = Integer.MAX_VALUE; 
        

        for (int i = 0; i < n; i++) { // O(n) runs n times
            int num = sc.nextInt();

            array[i] = num;

            if (array[i] < temp) {
                temp = array[i];
            }
        }
        
        sc.close();
        
        return temp;
    }
}
