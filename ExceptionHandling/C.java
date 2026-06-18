package ExceptionHandling;

public class C {
    public static void main(String[] args){
        String str = "ankit";

        try{
            int a = Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("String"+str+"can't be Converted to Integer");
        }
    }
}
