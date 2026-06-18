package ExceptionHandling;
//throws keyword ko samjho 

public class I {
    public static void Wait() throws InterruptedException {//it throws to main

        for(int i = 1; i <= 10;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException{// it throws to JVM//do not write this if you using the try catch
        // Wait();
        // System.out.println("main method ended");
        //but iska jruri nahi hota last tak execute karna isliye try catch krdo jada sahi rahega

        try{
            Wait();
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Exception Handled...");
        }
        System.out.println("main method ended");
    }
}
