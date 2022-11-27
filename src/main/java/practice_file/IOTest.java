package main.java.practice_file;

import java.io.*;
import java.nio.file.Files;

/*inputStream 과 inputStreamReader의 차이점
byteStream : 1byte를 입력 시켰을 때 1byte만 읽음
inputStream : 불러올 때 유니코드 저장, 1byte만 읽음, 2byte를 입력시킴
inputStreamReader : 1byte만 읽으면 한글 못함 -> 2byte로 읽음
* */
//public class IOTest {
//    public static void main(String[] args) throws Exception {
//        String fileName = "C:\\Temp\\file.txt";
//
//        byte[] buf = new byte[100];
//        try (FileInputStream fis = new FileInputStream(fileName);
//        BufferedInputStream bis = new BufferedInputStream(fis);) {
//            int c;
//            while ((c=bis.read()) != -1)
//                System.out.print((char) c);
//            fis.close();
//            bis.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(fileName + "파일을 열 수 없습니다.");
//        } catch (IOException ex) {
//            System.out.println(fileName + "파일을 읽을 수 없습니다.");
//        }
//    }
//}

public class IOTest {
    public static void main(String[] args) throws Exception {
        String fileName = "C:\\Temp\\file.txt";
        File f = new File(fileName);

        byte[] buf = new byte[100];
        try (BufferedReader br = new BufferedReader(new FileReader(f));) {
            Files.lines(f.toPath()).forEach(System.out::println);
        } catch (FileNotFoundException ex) {
            System.out.println(fileName + "파일을 열 수 없습니다.");
        } catch (IOException ex) {
            System.out.println(fileName + "파일을 읽을 수 없습니다.");
        }

    }
}

