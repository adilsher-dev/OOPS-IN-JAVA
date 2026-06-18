package Super;

class A {
    int a = 10;
}

class B extends A {
    int a = 20;
    void show(){
        System.out.println(a);//prints 20
        System.out.println(super.a);//It calls A class variable//prints 10
    }
}

public class First {
    public static void main(String[] args){
        B r = new B();
        r.show();
    }
    
}
