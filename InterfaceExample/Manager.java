// Manager class extending EmployeeBase and implementing Managable
public class Manager extends EmployeeBase implements Managable {

    @Override
    public void doWork() {
        System.out.println("Manager is working on managerial tasks.");
    }

    @Override
    public void manageTeam() {
        System.out.println("Manager is managing the team.");
        System.out.println("Assigning tasks, providing guidance, and ensuring productivity.");
    }

    @Override
    public void conductMeeting() {
        System.out.println("Manager is conducting a team meeting.");
        System.out.println("Discussing project updates, challenges, and future plans.");
    }

    @Override
    public void provideGuidance(String specificGuidance) {
        System.out.println("Manager is providing guidance to the team.");
        System.out.println("Specific guidance for the team: " + specificGuidance);
    }
}
