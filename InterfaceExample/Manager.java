// Manager class implementing interfaces
public class Manager implements Workable, Managable, Reportable {

    @Override
    public void doWork() {
        System.out.println("Manager is working on managerial tasks.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Manager is taking a managerial break.");
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

    @Override
    public void generateReport() {
        System.out.println("Manager is generating a managerial report.");
        System.out.println("Compiling data and summarizing team performance.");
    }

    @Override
    public void analyzeData() {
        System.out.println("Manager is analyzing managerial data.");
        System.out.println("Drawing insights to make informed decisions.");
    }
}
