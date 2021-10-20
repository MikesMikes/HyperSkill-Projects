package encryptdecrypt;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mode = "";
        int key = 0;
        char[] data = null;
        //[java, Main, -mode, enc, -key, 5, -data, Welcome to hyperskill!]

        for (int i = 0; i < args.length - 1; i += 2) {
            if (args[i].equals("-mode")) {
                mode = args[i + 1];
            }
            if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            }
            if (args[i].equals("-data")) {
                data = args[i + 1].toCharArray();
            }
        }

        if (data == null) {
            System.out.println("");
        } else if (mode.equals("dec")) {
            dec(data, key);
        } else {
            enc(data, key);
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
