package Threads;

class A extends Thread{

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Adil Sher");
        }
    }
}

public class B {
    public static void main(String[] args){
        //here only main thread hai
        A t = new A();//yahn bhi
        t.start();//yahan 2 thread hogye main + t 

        //this is the job of the main thread

        for(int i = 1; i <= 5; i++){
            System.out.println("Muskan Sher");
        }
    }
}
