package Super;

class A {
    void show(){
        System.out.println("Hello A");
    }
}

class B extends A {
    void show(){
        super.show();
    System.out.println("Hello B");
    }
}


public class Second {
    public static void main(String[] args){
        B r = new B();
        r.show();

    }
    
}
