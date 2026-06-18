package Constructor;

class A {
    int a;
    String name;

    A(){

    }

    A(int a){
        this.a = a;
    }

    A(int a,String name){
        this.a = a;
        this.name = name;
    }

    void display(){
        System.out.println(a + " " + name);
    }


}

public class Overloading {
    public static void main(String[] args){
        A a = new A();

        A a1 = new A(5);
        a1.display();

        A a2 = new A(5,"Adil");
        a2.display();

    }
}
