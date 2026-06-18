package ExceptionHandling;

public class G {
    public static void main(String[] args){

        System.out.println(10/0);//ye wala kaam jvm kar rha hai

        throw new ArithmeticException("/ by zero");

    }
}
