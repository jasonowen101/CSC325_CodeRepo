// Employee class extending EmployeeBase and implementing Managable
public class Employee extends EmployeeBase implements Managable {

    @Override
    public void doWork() {
        System.out.println("Employee is working on assigned tasks.");
    }

    @Override
    public void manageTeam() {
        System.out.println("Employee does not manage a team.");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Employee does not conduct team meetings.");
    }

    @Override
    public void provideGuidance(String specificGuidance) {
        System.out.println("Employee is providing guidance for individual tasks: " + specificGuidance);
    }
}
