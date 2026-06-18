package Constructor;

class A {
    int a;
    double b;
    private A(){
        a = 10;
        b = 5.544;

        System.out.println(a+" "+b);

    }
    //iske data ko access krne ke liye ishi class ke main method me obj banana hoga ..
}

public class Private {
    //iske main method me banaoge toh dikkat aygi error
    
    public static void main(String[]args){

    }
}
