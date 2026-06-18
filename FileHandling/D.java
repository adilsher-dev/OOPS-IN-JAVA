package FileHandling;
//rename a file
import java.io.*;

public class D {
    public static void main(String [] args){
        File f = new File("D:\\JAVA2\\FileHandling\\JH.txt");
        File r = new File("D:\\JAVA2\\FileHandling\\LC1.txt");

        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("File doesn't exists..!");
        }
    }
}
