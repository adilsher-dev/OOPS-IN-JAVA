package Interfaces;

interface A{

    void a1();
    void a2();
    default void a3(){
        System.out.println("Default Method:");
    }

}

class B implements A{

    public void a1(){
        System.out.println("Class B a1()");
    }
    public void a2(){
        System.out.println("Class B a2()");
    }

}

class C implements A{

    public void a1(){
        System.out.println("Class C a1()");
    }
    public void a2(){
        System.out.println("Class C a2()");
    }

}

public class D {
    public static void main(String[] args){
        B b = new B();
        b.a1();
        b.a2();
        b.a3();//we can do this

        C c = new C();
        c.a1();
        c.a2();
        c.a3();//we can do this

    }
    
}
