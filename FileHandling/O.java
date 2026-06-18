package FileHandling;
import java.io.*;
//read information from file
public class O {
    public static void main(String[] args){
        File f = new File("D:\\JAVA2\\FileHandling\\LC.txt");

        if(f.exists()){
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canWrite());
            System.out.println(f.canRead());
            System.out.println(f.length());
            System.out.println(f.delete());
        }
        else{
            System.out.println("File Doesn't Exists");
        }
    }
}
