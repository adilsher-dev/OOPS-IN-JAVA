package Interfaces;

interface A{
    public static void show(){//static method inside interface
        System.out.println("Can't Overrride");
        //we cannot need the implementing classees in this also
    }
}

public class S {

    public static void main(String[] args){
        A.show();//no object needed for static method
    }
}
//cant override the static method..
//we can also insert the main method inside the interface