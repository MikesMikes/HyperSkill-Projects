import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        int k = scanner.nextInt();
        double money = m;
        int years = 0;
        while (m < k) {
            m = m + (m / 100 * p);
            years++;
        }

        System.out.println(years);
    }
}