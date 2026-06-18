package This;

class Shape {

    void draw(){
        System.out.println("Can't Say Shape Type");
    }
}

class Square extends Shape {

    @Override
    void draw(){
        System.out.println("Square Shape");

    }
}

public class AJJa {
    public static void main(String[] args){
        Shape r = new Square();
        r.draw();

    }
    
}//agar method overridden nahi hai to shape class ka mthod execute hoga
