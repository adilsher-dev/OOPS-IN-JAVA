package Interfaces;


interface Client{
    void design();//public + abstract hote hai
    void develop();
}
class RajTech implements Client{

    @Override
    public void design(){
        System.out.println("Green,top menu,three dot button");
    }
    public void develop(){
        System.out.println("Develop");

    }
}

public class E {
    public static void main(String[] args){
        Client c = new RajTech();
        c.design();
        c.develop();
    }
}
