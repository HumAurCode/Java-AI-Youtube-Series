package Inheritance;

public class Developers extends Employee{
    private double projectBonus;

    public Developers(String name, int age, double salary, double projectBonus) {
        super(name, age, salary);
        this.projectBonus = projectBonus;
    }

    public void salary(){
        double total=this.projectBonus+ this.salary;
        System.out.println("Total salary : " + total) ;
    }
}
