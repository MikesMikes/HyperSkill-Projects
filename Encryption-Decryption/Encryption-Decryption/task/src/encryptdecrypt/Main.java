package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray(); //abc vwx = fgh abc
        int key = scanner.nextInt();

        String output = "";

        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                output += string[i];
                continue;
            }
            char toAdd = (char) ((char) string[i] + key);

            if (string[i] + key > 'z') {
                output = output + (char) ((char) toAdd - 26); //read the integer value of i + 5 and subtract length of alphabet
            } else {
                output += toAdd;
            }
        }

        System.out.println(output);
    }
}
