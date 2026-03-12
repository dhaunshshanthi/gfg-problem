V]import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int g = sc.nextInt(); // cost of green
            int p = sc.nextInt(); // cost of purple

            int n = sc.nextInt(); // number of participants

            int count1 = 0;
            int count2 = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a == 1) count1++;
                if (b == 1) count2++;
            }

            int cost1 = count1 * g + count2 * p;
            int cost2 = count1 * p + count2 * g;

            System.out.println(Math.min(cost1, cost2));
        }

        sc.close();
    }
}
