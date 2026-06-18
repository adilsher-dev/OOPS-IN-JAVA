package Abstract;

abstract class Programming{

    public abstract void Developer();//compulsory hai isko override karna
}
class HTML extends Programming{

    @Override
    public void Developer(){
        System.out.println("Tim Berners Lee");
    }
}

class Java extends Programming{

     @Override
    public void Developer(){
        System.out.println("James Gosley");
    }

}

public class F {
    public static void main(String[] args){
        HTML h = new HTML();
        Java j = new Java();
        h.Developer();
        j.Developer();
        //abstract class ka ref bana sakte hai...
    }
}
