package Interfaces;
//inheritance is also done in interface
interface Gill{
    void add();
}
interface Raj extends Gill{
    void sub();
}
class Ankit implements Raj{

    @Override
    public void add(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
    @Override
    public void sub(){
        int a = 10;
        int b = 20;
        System.out.println(a-b);
    }
}

public class I {
    public static void main(String[]args){
        Raj r = new Ankit();
        r.add();
        r.sub();



    }
}
