package main.java.fileEx;

import java.io.File;

public class FileExistTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Gwak\\Desktop\\glass.png");
        if (f.canRead())
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
