import java.util.Scanner;

// O(n) time complexity

public class p2 {
    public static void main(String[] args) {
        avg();
    }

    public static void avg() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = num;
            sum += array[i];
        }   

        float average = sum / n;

        System.out.println(average);

        sc.close();
    }
}
