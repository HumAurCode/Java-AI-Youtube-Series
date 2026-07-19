package AbstractionAndInterface;

public abstract class Employee {
     int id;
     String name;
     double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void login(){
        System.out.println(name + " is login");
    }
    public void logout(){
        System.out.println(name + " is logout");
    }
    public abstract void work();
}
