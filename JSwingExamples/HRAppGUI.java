import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HRAppGUI extends JFrame {

    private JTextField txtEmployeeId, txtFirstName, txtLastName, txtAge;
    private JButton btnSave, btnRead, btnUpdate, btnDelete;

    public HRAppGUI() {
        setTitle("HR Web App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblEmployeeId = new JLabel("Employee ID:");
        JLabel lblFirstName = new JLabel("First Name:");
        JLabel lblLastName = new JLabel("Last Name:");
        JLabel lblAge = new JLabel("Age:");

        txtEmployeeId = new JTextField();
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtAge = new JTextField();

        btnSave = new JButton("Save");
        btnRead = new JButton("Read");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveEmployee();
            }
        });

        btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readEmployee();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateEmployee();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployee();
            }
        });

        add(lblEmployeeId);
        add(txtEmployeeId);
        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAge);
        add(txtAge);
        add(btnSave);
        add(btnRead);
        add(btnUpdate);
        add(btnDelete);

        setVisible(true);
    }

    private void saveEmployee() {
        // Implement logic for saving employee data
        JOptionPane.showMessageDialog(this, "Employee saved successfully!");
    }

    private void readEmployee() {
        // Implement logic for reading employee data
        JOptionPane.showMessageDialog(this, "Employee data read successfully!");
    }

    private void updateEmployee() {
        // Implement logic for updating employee data
        JOptionPane.showMessageDialog(this, "Employee data updated successfully!");
    }

    private void deleteEmployee() {
        // Implement logic for deleting employee data
        JOptionPane.showMessageDialog(this, "Employee data deleted successfully!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HRAppGUI();
            }
        });
    }
}
