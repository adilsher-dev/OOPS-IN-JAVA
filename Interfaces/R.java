package Interfaces;
import java.util.*;

interface client {

    void input();//public+abstract
    void output();//public+abstract
}

class Raju implements client{

    String name;
    double sal;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = sc.nextLine();

        System.out.println("Enter Salary:");
        sal = sc.nextDouble();
    }

    public void output(){
        System.out.println(name+" "+sal);
    }
}

public class R {
    public static void main(String[] args){
        client c = new Raju();
        c.input();
        c.output();
    }
}
