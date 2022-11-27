package main.java.fileEx;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gwak\\InteliJ-workspace\\Advanced_Java\\src\\main\\java\\fileEx");
        File[] fs= file.listFiles();

        for (File f:fs)
            if(f.isDirectory())
                System.out.printf("dir : %s\n",f);
            else
                System.out.printf("file : %s(%d bytes)\n",f,f.length());
    }
}
