package main.java.practice_file;

import java.io.*;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine(); //isr로 source이름 받아옴
        BufferedReader fr = new BufferedReader(new FileReader(source)); //source 까
        String s;
        int indexNumber = 0;
        while(true)
            if((s=fr.readLine()) == null)
                break;
            System.out.printf("%d : %s\n",indexNumber++,s);
        fr.close();

    }
}
