package This;

class A {

    void show() {
    System.out.println(this);

    }

}

public class Ajao {
    public static void main(String[] args){
    A r = new A();
    System.out.println(r);//both lines  print same address
    r.show();//both lines 
}
}
