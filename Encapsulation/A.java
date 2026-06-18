package Encapsulation;

class B {
    private int value;

    public void setValue(int x){
        value = x;
    }
    public int getValue(){
        return value;
    }
}

public class A {
    public static void main(String[] args){
    B r = new B();
    r.setValue(100);
    System.out.println(r.getValue());
    }
}