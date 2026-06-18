package VaraRGS;

class A {
    int sum = 0;
    void add(int ...a){
        int n = a.length;
        for(int i = 0;i<n;i++){
        sum += a[i];
    }
}

public class H{
    public static void main(String[] args){
        A r = new A();
        r.add();
        r.add(10);
        r.add(10,20);
        r.add(10,20,30,40);
    }
}
}
