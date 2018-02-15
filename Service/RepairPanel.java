
import java.awt.*;
import javax.swing.*;


/**
 * Exam 3
 * @author Joey Reidell
 * 5/9/16
 */
public class RepairPanel extends JPanel{
    // Constant for hourly pay rate
    private final double HOURLY_RATE = 47.75;
    private JTextField parts; // Parts of charges
    private JTextField hours; // Hours of labor
    
    /**
      Constructor
     */
    public RepairPanel(){
        // Create the labels and text fields
        JLabel partsMsg = new JLabel("Parts Charges:");
        JLabel hoursMsg = new JLabel("Hours of Labor:");
        parts = new JTextField(10);
        hours = new JTextField(10);
        
        // Initialize the text fields to "0".
        parts.setText("");
        hours.setText("");
        
        // Create a GridLayout manager
        setLayout(new GridLayout(2, 2));
        
        // Create a border
        setBorder(BorderFactory.createTitledBorder("Repair Services"));
        
        // Add the labels and text fields to this panel
        add(partsMsg);
        add(parts);
        add(hoursMsg);
        add(hours);
        
    }
    
    /**
      The getCharges method calculates the repair charges.
      @return the amount of repair charges.
     */
    public double getCharges(){
        if(parts.getText().equals("")){
            parts.setText("0");
        }
        if(hours.getText().equals("")){
            hours.setText("0");
        }
        double charges = Double.parseDouble(parts.getText()) + 
                (Double.parseDouble(hours.getText()) * HOURLY_RATE);
        return charges;
    }
    /**
      The clearCharges method clears the repair charges
     */
    public void clearCharges(){
        parts.setText("");
        hours.setText("");
        parts.requestFocus();
    }
}
