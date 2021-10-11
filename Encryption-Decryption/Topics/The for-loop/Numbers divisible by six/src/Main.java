import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int elements = scanner.nextInt();
        for (int i = 0; i < elements; i++) {
            int a = scanner.nextInt();
            if (a % 6 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
