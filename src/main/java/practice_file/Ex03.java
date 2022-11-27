package main.java.practice_file;

import java.io.*;

public class Ex03 {
    public static void main(String[] args) throws IOException {
        double[] numbers = {2.35,3.14,5.24,6.00,1.25};
        String outPath = "C:\\Temp\\double.txt";

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(outPath));
        for(double d : numbers)
            dos.writeDouble(d);
        DataInputStream dis = new DataInputStream(new FileInputStream(outPath));
        double d;
        while((d=dis.readDouble())!=-1)
            System.out.print(d+",");


    }
}
