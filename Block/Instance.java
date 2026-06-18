package Block;

class A{
    int a, b;

    void show(){
        a = 50;
        b = 60;
        System.out.println(a+" "+b);
    }
    A(){
        a = 20;
        b = 30;
        System.out.println(a+" "+b);
    }
    {
        a = 10;
        b = 20;
        System.out.println(a+" "+b);                        //ans:- first instance block executed , cons , show method
    }
}

public class Instance {
    public static void main(String[] args){
        A r = new A();
        r.show();


    }
    
}
