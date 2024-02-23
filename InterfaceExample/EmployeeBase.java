// Abstract class for common functionality
public abstract class EmployeeBase implements Workable, Reportable {

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
}
