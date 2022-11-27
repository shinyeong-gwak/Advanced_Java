package main.java.fileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadLineTest {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        while(true){
            System.out.print("input : ");
            String line = null;
            try {
                line = br.readLine(); //이거 확실히 알아야겠다 왜 line인지, 버퍼리더랑 리더 차이가 뭔지
            }catch (IOException e) {}
            if (line.length() == 0)
                break;
            System.out.println(line);
        }
        // 스캐너가 나오기 전에 이거 만들어썼음. 정수리턴은 잘 안된다는 특징이 있음
    }
}
