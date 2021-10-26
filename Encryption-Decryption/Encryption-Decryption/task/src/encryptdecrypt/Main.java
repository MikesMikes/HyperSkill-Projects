package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String output = "";
        String mode = "";
        int key = 0;
        char[] data = null;
        File fileIn = null;
        File fileOut = null;


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
            if (args[i].equals("-in")) {
                fileIn = new File(String.valueOf(args[i + 1]));
            }
            if (args[i].equals("-out")) {
                fileOut = new File(String.valueOf(args[i + 1]));
            }
        }

        output = createString(data, fileIn, mode, key);

        if (fileOut != null) {
            writeToFile(fileOut, output);
        } else {
            System.out.println(output);
        }


    }

    public static String createString(char[] data, File fileIn, String mode, int key) {
        StringBuilder output = new StringBuilder();
        char[] chars;

        if (data != null) {
            chars = data.clone();
        } else if (fileIn != null) {
            chars = readFromFile(fileIn);
        } else {
            return "";
        }

        if (mode.equals("dec")) {
            for (char aChar : chars) {
                output.append((char) (aChar - key));
            }
        } else {
            for (char aChar : chars) {
                output.append((char) (aChar + key));
            }
        }

        return output.toString();
    }


    public static char[] readFromFile(File file) {
        char[] chars = null;
        String data = "";

        try (Scanner scanner = new Scanner(Paths.get(String.valueOf(file)))) {
            while (scanner.hasNextLine()) {
                data += scanner.nextLine();
            }

            chars = data.toCharArray();
        } catch (Exception e) {
            System.out.println(e);
        }

        return chars;
    }

    public static void writeToFile(File fileOut, String output) {

        try (FileWriter writer = new FileWriter(fileOut)) {
            writer.write(String.valueOf(output));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
