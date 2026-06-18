package Block;

public class A {
    A(){
        System.out.println("Please Share");
    }
    {
        System.out.println("Please Like");//instance block obj banana hoga ..//static var , normal var dono ko access kr lete h
    }
    static{
        System.out.println("Static");//sabse pehle execute hoga obj banane ki jrurt nahi//normal var ni leta ye static variable le skta hai ohk
    }

    public static void main(String[] args){
        A r = new A();





    }
}
