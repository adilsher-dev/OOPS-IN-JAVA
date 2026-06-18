package ExceptionHandling;

public class P {
    public static void main(String[]args){
    try{
        m1();
        }
        catch(ArithmeticException a){
            System.out.println("Exception Handled...!");
        }
    }
    public static void m1(){
        
        
        m2();
        
        
    }
    public static void m2(){
        System.out.println(10/0);
    }
}
//this is the concept of the exception propagation concepts
