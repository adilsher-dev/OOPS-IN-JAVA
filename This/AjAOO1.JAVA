package This;

// This is the called the method overloading...

class A {
    void add(){
        int a = 10;
        int b = 20;
        int c;
        c = a+b;
        System.out.println(c);
    }
    void add(int x , int y){
        int c;
        c = x + y;
        System.out.println(c);
    }
    void add(int x,double y){
        int c;
        c = x + y;
        System.out.println(c);
    }
}


public class AjAOO1{
    public static void main(String[] args){
        A r = new A();
        r.add();
        r.add(2,3);
        r.add(2,4.56);

    }
}