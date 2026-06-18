package Basic;
import java.util.*;

public class Basic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        while(!pass.equals("admin123")){
            System.out.println("Enter pass again");
            pass = sc.nextLine();
        }
        System.out.println("Access Granted");
    }
}
