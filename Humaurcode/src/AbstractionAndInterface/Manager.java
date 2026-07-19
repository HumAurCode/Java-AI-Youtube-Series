package AbstractionAndInterface;

public class Manager extends Employee implements ConductMeeting,Leave {

    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Manager is leading the team");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Manager Conducting meeting");
    }

    @Override
    public void leave() {
        System.out.println("Leaving the team");
    }

}
