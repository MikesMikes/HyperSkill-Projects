import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        boolean flag = true;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) + 1 != string.charAt(i+1)){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}