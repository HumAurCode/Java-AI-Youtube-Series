package Inheritance;

public class Developers extends Employee{
    private double projectBonus;

    public Developers() {

    }


    public Developers(String name, int age, double salary, double projectBonus) {
        super(name, age, salary);
        this.projectBonus = projectBonus;
    }

    //polymorphism

    public void salary(){
        double total=this.projectBonus+ this.salary;
        System.out.println("Total salary : " + total) ;
    }
    public void salary(double projectBonus){
        System.out.println(projectBonus);
    }
    public void salary(int projectBonus){
        System.out.println(projectBonus);
    }

    @Override
    public void show(){
        System.out.println("Child class");
    }
}
