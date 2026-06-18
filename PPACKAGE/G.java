package PPACKAGE;
import java.io.*;
import java.util.*;
//Read data from a file
public class G {
    public static void main(String [] args){
        try{
            File r = new File("path");
            Scanner sc = new Scanner(r);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.print("Exception Handled...!");
        }
    }
}
