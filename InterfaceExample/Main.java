// Example usage
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();

        // Employee methods
        employee.doWork();
        employee.takeBreak();
        employee.generateReport();
        employee.analyzeData();
        employee.manageTeam();  // Employee does not manage a team
        employee.conductMeeting();  // Employee does not conduct team meetings
        employee.provideGuidance("Focus on completing your assigned tasks.");

        System.out.println();

        // Manager methods
        manager.doWork();
        manager.takeBreak();
        manager.manageTeam();
        manager.conductMeeting();
        manager.generateReport();
        manager.analyzeData();
        manager.provideGuidance("Ensure effective collaboration and communication among team members.");
    }
}
