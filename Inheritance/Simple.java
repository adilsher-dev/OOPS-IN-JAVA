package Inheritance;

class A {
    int roll;
    String name;

    void input(){
        System.out.println("Enter Roll and Name:");
    }

}


public class Simple extends A{//private no access , protected access by inheritance
    
    

    void display(){
        roll = 10;
    name = "Adil Sher";
        System.out.println(roll+" "+name);
    }
    public static void main(String[] args){
        Simple r = new Simple();
        r.input();
        r.display();
    }
    
}
