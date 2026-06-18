package ExceptionHandling;
import java.util.*;

public class H {
    public static void main(String[] args) {//throws InterruptedException////throw this exception to the jvm
        for(int i = 1; i <= 10;i++){
            // System.out.println(i);
            // Thread.sleep(1000);//checked exception
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(i);
            }
        }
        //best approach is try catch...
    }
}
