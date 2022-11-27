package main.java.fileEx;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "C:\\Users\\Gwak\\InteliJ-workspace\\Advanced_Java\\src\\main\\java\\fileEx\\readMe.txt";
        String output = "C:\\Users\\Gwak\\InteliJ-workspace\\Advanced_Java\\src\\main\\java\\fileEx\\outfile.txt";

        try (FileReader fr = new FileReader(input);
            FileWriter fw = new FileWriter(output)) {
            int c;

            while ((c=fr.read()) != -1)
                fw.write(c);
        } catch (IOException e) {
        }
    }
}
