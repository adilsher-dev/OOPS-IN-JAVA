package Threads;

//by implementing Runnable Interface

class A implements Runnable{

    public void run(){

        for(int i  = 1; i <= 5;i++){
        System.out.println("MSG");
        }
    }
}

public class C {
    public static void main(String[] args){
        A r = new A();//isse kaam nahi chalega kyunki start method thread class ke paas hota hai na ki runnable interface ke paas

        Thread t = new Thread(r);//we have to pass the reference
        t.start(); 

        for(int i = 0 ; i <= 5; i++){
            System.out.println("Main Method");
        }
    }
}
