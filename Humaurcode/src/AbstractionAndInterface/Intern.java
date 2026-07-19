package AbstractionAndInterface;

public class Intern extends Employee {

    public Intern(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Intern in learning");
    }

}
