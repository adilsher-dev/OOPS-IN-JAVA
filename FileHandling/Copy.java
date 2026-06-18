
package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {

        FileInputStream r = new FileInputStream("D:\\JAVA2\\FileHandling\\U.txt");
        FileOutputStream w = new FileOutputStream("D:\\JAVA2\\FileHandling\\O.txt");

        int i;
        while ((i = r.read()) != -1) {
            w.write(i);
        }

        r.close();
        w.close();

        System.out.println("Data Copied Successfully");
    }
}