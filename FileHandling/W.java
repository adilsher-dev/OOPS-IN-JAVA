package FileHandling;
import java.io.*;
//How To Write...
//we can also use BufferedWriter//FileOutputStream//PrintWriter instead of FileWriter
class W {
    public static void main(String[] args){
        try{
            FileWriter  f = new FileWriter("D:\\JAVA2\\FileHandling\\LC.txt");
            try{
                f.write("Java Programming is the best Language");
            }
            finally{
                f.close();
            }
            System.out.println("Successfully Data wrote in File");

        }
        catch(IOException i){
            System.out.println(i);
        }  
    }
}