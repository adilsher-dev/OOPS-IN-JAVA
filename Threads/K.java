package Threads;
import java.util.*;

//MultiThreading Problem...
//we have to synchronized the method
class Bus implements Runnable {
    int available = 1;
    int passenger;
    Bus (int passenger){
        this.passenger = passenger;
    }
    public synchronized void run(){//ab isme 1 hi thread aayega not all 3

        String name =Thread.currentThread().getName();

        if(available >= passenger){
            System.out.println(name);
            available -= passenger;

        }
        else{
            System.out.println("Sorry seat not available");
        }
    }
}

public class K {
    public static void main(String[] args){
        Bus r = new Bus(1);

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Raju");

        t1.start();
        t2.start();
        t3.start();

    }
    
}
