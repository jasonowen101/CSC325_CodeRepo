// Employee class implementing interfaces
public class Employee implements Workable, Reportable, Managable {

    @Override
    public void doWork() {
        System.out.println("Employee is working on assigned tasks.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Employee is taking a break.");
    }

    @Override
    public void generateReport() {
        System.out.println("Employee is generating a report.");
    }

    @Override
    public void analyzeData() {
        System.out.println("Employee is analyzing data.");
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
