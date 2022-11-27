package main.java.fileEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamReaderDemo {
    public static void main(String[] args) {
        String input = "C:\\Users\\Gwak\\InteliJ-workspace\\Advanced_Java\\src\\main\\java\\fileEx\\readMe.txt";

        try (FileInputStream fi = new FileInputStream(input);
             InputStreamReader in = new InputStreamReader(fi, "US-ASCII")) {
            int c;

            System.out.println(in.getEncoding());
            while ((c = in.read()) != -1)
                System.out.print((char) c);
        }catch (IOException e) {
        }
    }
}
