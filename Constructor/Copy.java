package Constructor;

class A{

    int a;
    String b;
    A(){//default cons
        a = 10;
        b = "Adil";
        System.out.println(a+""+b);
    }
    A(A ref){//copy constructor
        a=ref.a;
        b=ref.b;
        System.out.println(a+""+b);
    }
}

public class Copy {
    public static void main(String[] args){
        A r = new A();
        A r2 = new A(r);

    }
    
}
