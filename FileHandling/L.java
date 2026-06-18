package FileHandling;
import java.io.*;

public class L {
    public static void main(String[] args){
        File f = new File("D:\\JAVA2\\FileHandling\\LC.txt" );
        try{
            if(f.createNewFile()){
                System.out.println("File successFully Create..!");
            }
            else{
                System.out.println("File Already exists..!");
            }
        }
        catch(IOException i){
            System.out.println("Exception Handled..!");
        }
    }
}
//we can also use throws instead of try and catch