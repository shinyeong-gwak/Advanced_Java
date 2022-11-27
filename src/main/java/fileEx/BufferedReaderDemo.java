package main.java.fileEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo{
    public static void main(String[] args) {
        String input = "C:\\Users\\Gwak\\InteliJ-workspace\\Advanced_Java\\src\\main\\java\\fileEx\\readMe.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(input));) {
            br.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {
        }
    }
}
