// Intern class not extending EmployeeBase
public class Intern implements Workable {

    @Override
    public void doWork() {
        System.out.println("Intern is working on assigned tasks.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Intern is taking a break.");
    }
}
