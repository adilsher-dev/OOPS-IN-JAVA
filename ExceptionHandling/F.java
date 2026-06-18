package ExceptionHandling;

public class F {
    public static void main(String[] args){
        try{
            String a = "adil";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
            System.out.println(10/0);
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
            finally{
                System.out.println("Learn Coding");
            }
        System.out.println("main method ended");
    }
}
}