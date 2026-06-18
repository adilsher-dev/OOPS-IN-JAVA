package ExceptionHandling;

public class D {
    public static void main(String[] args){

        try{
            System.out.println("Learn Coding");
            int a = 20;
            int b = 2;
            int c;
            c = a/b;
            System.out.println(c);
            System.out.println("Like Share");
        }
        catch(ArithmeticException a){
            System.out.println("can't divide by zero");
        }
        finally{
            System.out.println("subscribe");
        }
        System.out.println("main method ended");
    }
}


//for next code we need multiple catch block no. of exceptions are more than one