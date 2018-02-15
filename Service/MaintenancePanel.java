
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;


/**
 * Exam 3
 * @author Joey Reidell
 * 5/9/16
 */
public class MaintenancePanel extends JPanel{
    // Named constants for charges 
    private final double OIL_CHANGE_CHARGE = 24.95;
    private final double FRONT_BRAKES_CHARGE = 77.95;
    private final double REAR_BRAKES_CHARGE = 59.95;
    private final double TUNE_UP_CHARGE_4CLY = 89.95;
    private final double STATE_INSPECTION_CHARGE = 29.95;
    private final double EMISIONS_CHARGE = 21.95;
    private final double TIRE_ROTATION_CHARGE = 19.95;
    
    private JCheckBox oilChange;
    private JCheckBox frontBrakes;
    private JCheckBox rearBrakes;
    private JCheckBox tuneUp;
    private JCheckBox inspection;
    private JCheckBox emission;
    private JCheckBox tireRotation;
    
    /**
      Constructor
     */
    
    public MaintenancePanel(){
        // Create a DecimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        // Create the check boxes
        oilChange = new JCheckBox("Oil Change ($" + 
                dollar.format(OIL_CHANGE_CHARGE) + ")");
        frontBrakes = new JCheckBox("Replace Front Brakes ($" + 
                dollar.format(FRONT_BRAKES_CHARGE) + ")");
        rearBrakes = new JCheckBox("Replace Rear Brakes ($" + 
                dollar.format(REAR_BRAKES_CHARGE) + ")");
        tuneUp = new JCheckBox("Tune Up - 4cyl Eng ($" + 
                dollar.format(TUNE_UP_CHARGE_4CLY) + ")");
        inspection = new JCheckBox("State Inspection ($" + 
                dollar.format(STATE_INSPECTION_CHARGE) + ")");
        emission = new JCheckBox("State Emissions ($" + 
                dollar.format(EMISIONS_CHARGE) + ")");
        tireRotation = new JCheckBox("Tire Rotation ($" + 
                dollar.format(TIRE_ROTATION_CHARGE) + ")");
        
        // Create a GridLayout manager.
        setLayout(new GridLayout(7, 1));
        
        // Create a border
        setBorder(BorderFactory.createTitledBorder("Maintenance"));
        
        // Add the check boxes to this panel
        add(oilChange);
        add(frontBrakes);
        add(rearBrakes);
        add(tuneUp);
        add(inspection);
        add(emission);
        add(tireRotation);
    }
    
    /**
      The getCharges method calculates the routine charges.
      @return The amount of routine charges
     */
    
    public double getCharges(){
        double charges = 0;
        
        if(oilChange.isSelected()){
            charges += OIL_CHANGE_CHARGE;
        }
        if(frontBrakes.isSelected()){
            charges += FRONT_BRAKES_CHARGE;
        }
        if(rearBrakes.isSelected()){
            charges += REAR_BRAKES_CHARGE;
        }
        if(tuneUp.isSelected()){
            charges += TUNE_UP_CHARGE_4CLY;
        }
        if(inspection.isSelected()){
            charges += STATE_INSPECTION_CHARGE;
        }
        if(emission.isSelected()){
            charges += EMISIONS_CHARGE;
        }
        if(tireRotation.isSelected()){
            charges += TIRE_ROTATION_CHARGE;
        }
        return charges;
    }
    
    public void clearCheckBoxes(){
        oilChange.setSelected(false);
        frontBrakes.setSelected(false);
        rearBrakes.setSelected(false);
        tuneUp.setSelected(false);
        inspection.setSelected(false);
        emission.setSelected(false);
        tireRotation.setSelected(false);
    }
}
