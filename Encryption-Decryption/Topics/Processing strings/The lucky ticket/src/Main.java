import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        char[] number = scanner.next().toCharArray(); //090234
        int first3 = 0;
        int last3 = 0;

        for (int i = 0; i < number.length; i++) {
            int num = Integer.parseInt(String.valueOf(number[i]));
            if (i < number.length / 2) {
                first3 += num;
            } else {
                last3 += num;
            }
        }

        System.out.println(first3 == last3 ? "Lucky" : "Regular");
    }
}
