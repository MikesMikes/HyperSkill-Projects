package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        char[] string = scanner.nextLine().toCharArray(); //abc vwx = fgh abc
        int key = scanner.nextInt();

        if (operation.equals("enc")) {
            enc(string, key);
        } else {
            dec(string, key);
        }

    }

    public static void enc(char[] arr, int key) {
        char[] chars = arr.clone();
        StringBuilder string = new StringBuilder();

        for (char aChar : chars) {
            string.append((char) (aChar + key));
        }
        System.out.println(string);
    }

    public static void dec(char[] arr, int key) {
        char[] chars = arr.clone();
        StringBuilder string = new StringBuilder();

        for (char aChar : chars) {
            string.append((char) (aChar - key));
        }
        System.out.println(string);
    }
}
