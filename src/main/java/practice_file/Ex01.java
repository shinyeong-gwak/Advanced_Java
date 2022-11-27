package main.java.practice_file;

import java.io.File;

public class Ex01 {
    public static void main(String[] args) {
        File file =new File("C:\\Temp\\fi7le.txt");
        if(file.exists())
            System.out.println("파일이 존재함");
        else
            System.out.println("파일 존재하지 않음");
    }
}
