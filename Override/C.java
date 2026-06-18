package Override;
//this refers to the current object...

class A{
    A show(){
        System.out.println("show1");
        return this;//this --> new A();
    }
}

class B extends A{
    @Override
    B show(){
        super.show();//prints A class first 
        System.out.println("show2");
        return this;
    }
}

public class C {
    public static void main(String[] args){
        B r = new B();
        r.show();
    }
}
