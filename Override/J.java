package Override;


class A{
    void show(){
        System.out.println("Super Class");
    }

}

class B extends A{
    void show(){
        System.out.println("Sub class");
    }
}


public class J {
    public static void main(String[] args){
        B r = new B();
        r.show();

    }
}
