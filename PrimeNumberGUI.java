
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 * Final Exam
 * @author Joey Reidell
 * 12/10/15
 */
public class PrimeNumberGUI extends JFrame {
    private JPanel mainP, r1, r2, r3, r4;
    private JTextField numTF, resultTF;
    private JButton findB, clearB;
    private JLabel headLabel, rowLabel;
    
    public PrimeNumberGUI()
    {
        super("Prime Numbers");
        r1 = new JPanel();
        r2 = new JPanel();
        r3 = new JPanel();
        r4 = new JPanel();
        mainP = new JPanel(new GridLayout(4,1));
        
        // 1st row
        headLabel = new JLabel("Prime Numbers");
        headLabel.setFont(new Font("Sans Serif", Font.BOLD, 18));
        headLabel.setForeground(Color.BLUE);
        r1.add(headLabel);
        
        // 2nd row
        rowLabel = new JLabel("Enter Number:");
        numTF = new JTextField(8);
        r2.add(rowLabel);
        r2.add(numTF);
        
        // 3rd row
        resultTF = new JTextField(18);
        resultTF.setEditable(false);
        r3.add(resultTF);
        
        // 4th row
        findB = new JButton("Find");
        clearB = new JButton("Clear");
        findB.addActionListener(new ButtonHandler());
        clearB.addActionListener(new ButtonHandler());
        r4.add(findB);
        r4.add(clearB);
        
        mainP.add(r1);
        mainP.add(r2);
        mainP.add(r3);
        mainP.add(r4);
        
        add(mainP);
        setSize(250,235);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
    }
    
     private class ButtonHandler implements ActionListener
     {
         String pNumS;
         int pNum, i;
         
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == findB)
            {
              try{  
              pNumS = numTF.getText();
              pNum = Integer.parseInt(pNumS);
              
              for (i = 2; i < pNum; i++)
              {
                if (pNum % i == 0)
                {
                  resultTF.setText(pNum + " is NOT a prime number");
                  break;
                }
                
              }
              if(i == pNum)
                {
                  resultTF.setText(pNum + " is a prime number");
                }
                else if(pNum <= 1)
                {
                  resultTF.setText("Input Error"); 
                }
              }
              catch(NumberFormatException nfe)
              {
                  resultTF.setText("Input Error");
              }
              
            }
            else if(e.getSource() == clearB)
            {
                numTF.setText("");
                resultTF.setText("");
                numTF.requestFocus();
            }
        }
     }
     
     

    public static void main(String[] args) {
       new PrimeNumberGUI(); 
    }
    
}
