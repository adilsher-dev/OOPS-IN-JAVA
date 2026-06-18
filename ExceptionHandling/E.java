package ExceptionHandling;


public class E {
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);

            int arr[] = {10,20,30};
            System.out.println(arr[6]);

            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception x){
            System.out.println("All exception handled");
        }
    }
}
//ek exception pakde jaane par dusra nhi chlega
