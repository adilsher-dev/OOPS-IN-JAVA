package Super;

class A {

    A(){
        System.out.println("Hello A");

    }

}

class B extends A {

    B(){
        //super();//by default hota hai...
        System.out.println("Hello B");

    }
    
}


public class Third {
    public static void main(String[] args){
        B r = new B();
    } 
}
