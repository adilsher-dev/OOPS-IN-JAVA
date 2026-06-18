package ExceptionHandling;
//Null Pointer Exception


public class B {
    public static void main(String[] args){
        String str = null;

        try{
        System.out.println(str.toUpperCase());//Null Pointer Exception
        }
        catch(NullPointerException n){
            System.out.println("Null cannot be casted");
        }
    }
}
