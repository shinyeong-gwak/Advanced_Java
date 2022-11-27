package main.java.practice_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        File f = new File("C:\\Temp\\file.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(f));){
            String row;
            while ((row = br.readLine()) != null)
                System.out.println(row);
        } catch (IOException ignored) {
        }
    }
}
