package Constructor;



class A {
    int x;
    int y;

    A(int a,int b){
        x = a;
        y = b;
    }

    void show(){
        System.out.println(x+""+y);
    }


}

public class B {
    public static void main(String [] args){
        A obj = new A(100,200);
        obj.show();
    }
}
