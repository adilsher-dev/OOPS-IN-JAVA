package ExceptionHandling;
//Arithmetic Exception
public class A {
    public static void main(String[] args){

    int a = 10;
    int b = 0;
    int c = 0;

    try{
        c=a/b;
        System.out.println(c);
    }
    // catch(Exception e){
    //     System.out.println(e);
    // }
    //Exception is Super Class
    //ArithmeticException is Sub Class
    catch(ArithmeticException e){
        System.out.println(e);
    }
    }
}
