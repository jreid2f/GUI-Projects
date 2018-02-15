
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;


/**
 * Exam 3
 * @author Joey Reidell
 * 5/9/16
 */
public class ServiceGUI extends JFrame {

    private JPanel servicePanel;
    private JLabel totalServices;
    private JTextField totalCharges;
    private JButton calculateBt, clearBt;
    private MaintenancePanel maintPanel;
    private RepairPanel repPanel;
    private DecimalFormat dollar;
    
    public ServiceGUI(){
        servicePanel = new JPanel();
        totalServices = new JLabel("Total Charges:");
        totalServices.setForeground(Color.red);
        totalCharges = new JTextField(10);
        totalCharges.setEditable(false);
        calculateBt = new JButton("Calculate Charges");
        clearBt = new JButton("Clear Charges");
        maintPanel = new MaintenancePanel();
        repPanel = new RepairPanel();
        dollar = new DecimalFormat("$#,##0.00");
        servicePanel.setLayout(new GridLayout(2, 2, 5, 10));
        
        servicePanel.setBorder(
                BorderFactory.createTitledBorder("Total Services"));
        
        servicePanel.add(totalServices);
        servicePanel.add(totalCharges);
        servicePanel.add(calculateBt);
        
        calculateBt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double charges;
                try{
                charges = maintPanel.getCharges() + repPanel.getCharges();
                totalCharges.setText(dollar.format(charges));
                }
                catch(NumberFormatException nfe){
                    totalCharges.setText("ERROR");
                    JOptionPane.showMessageDialog(null, 
                            "Only numeric characters are allowed", "Error", 
                            JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });
        servicePanel.add(clearBt);
        clearBt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                maintPanel.clearCheckBoxes();
                repPanel.clearCharges();
                totalCharges.setText("");
            }
        });
        
        setLayout(new BorderLayout());
        add(maintPanel, BorderLayout.NORTH);
        add(repPanel, BorderLayout.CENTER);
        add(servicePanel, BorderLayout.SOUTH);
        
    }
    public static void main(String[] args) {
        ServiceGUI frame = new ServiceGUI();
        frame.setTitle("Automotive Service Menu");
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
