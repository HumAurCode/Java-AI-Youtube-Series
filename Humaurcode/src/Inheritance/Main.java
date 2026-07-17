package Inheritance;

public class Main {
    static void main() {
//        Developers d = new Developers("LAtif",26,50000,20000);
//        d.salary();
        //runtime polymorphism
        Employee obj=new Developers();
        obj.show();

        
    }
}
