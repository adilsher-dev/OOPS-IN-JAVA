package FileHandling;
import java.io.*;
//more classes are used also insted of FileReader BufferedReader ScannerClass FileInputStream
public class R {
    public static void main(String[] args){

        try{
            FileReader r =new FileReader("D:\\JAVA2\\FileHandling\\LC.txt");

            try{
                int i;
                while((i=r.read()) != -1){
                    System.out.print((char)i);
                }
            }
            finally{
                r.close();
            }
        }
        catch(IOException e){
            System.out.println("Exception Handled..!");
        }
    }
}