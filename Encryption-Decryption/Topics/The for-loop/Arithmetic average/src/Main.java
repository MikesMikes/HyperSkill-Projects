import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        double sum = 0;
        int nums = 0;
        final int magicNumber = 3;
        for (int k = i; k <= j; k++) {
            if (k % magicNumber == 0) {
                sum += k;
                nums++;
            }
        }
        System.out.println(sum / nums);
    }
}
