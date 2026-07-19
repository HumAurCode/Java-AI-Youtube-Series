package AbstractionAndInterface;

public class Main {
    public static void main(String[] args) {
        Developer d=new Developer(123,"Latif",50000);
        d.login();
        Manager m=new Manager(125,"Ahmad",60000);
        m.login();
        m.work();
        d.conductMeeting();
        m.conductMeeting();
        m.leave();

    }
}
