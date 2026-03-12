import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        
        char[] result = s.toCharArray();
        
        for (int i = 0; i < n; i++) {
            if (result[i] == '.') {
                result[i] = 'B';
            }
        }
        
        System.out.println("YES");
        System.out.println(new String(result));
    }
}
