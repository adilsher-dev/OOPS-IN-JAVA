package Threads;
//thread scheduler...

class A extends Thread{

    public void run(){

        String n = Thread.currentThread().getName();//this is the method to get the name
        for(int i = 1; i <= 3;i++){
            System.out.println(n);
        }
    }
}

public class D {
    public static void main(String[] args){
        //there are total 4 thread in this including the main thread

        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
