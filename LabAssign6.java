
import javax.swing.*;


/**
 * Lab Assignment 6-Graphics and JFrame
 * @author Joey Reidell 
 * 4/6/16
 */
public class LabAssign6 extends JFrame{
 
    public LabAssign6(){
         add(new RandomShapesPanel());
    }   
    
    public static void main(String[] args) {
        LabAssign6 gui = new LabAssign6();
        gui.setSize(500, 400);
        gui.setTitle("LabAssign6");
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setResizable(false);
    }
    
}
