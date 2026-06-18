package Interfaces;
//why interfaces variables are public,static and final

interface customerRaj{
    int amount = 5;//public+static+final
    void purchase(); //public + abstract

}

class sellerSanju implements customerRaj{

    @Override
    public void purchase(){
        System.out.println("Raj needs"+amount+"kg rice");
    }
}



public class T {
    public static void main(String[] args){
        customerRaj r = new sellerSanju();
        r.purchase();
        System.out.println(customerRaj.amount);//it shows variable is static 
    }
}
