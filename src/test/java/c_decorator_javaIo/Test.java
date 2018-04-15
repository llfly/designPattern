package c_decorator_javaIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ll on 15/04/2018.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            //new FileInputStream("test.txt")
            InputStream in = new LowerCaseInputStream(new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/test.txt"));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
