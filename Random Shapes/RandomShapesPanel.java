
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;


/**
 * Lab Assignment 6-Graphics and JFrame
 * @author Joey Reidell
 * 4/6/16
 */
public class RandomShapesPanel extends JPanel {
    private Color rColor;
    private Random rGen;
    private Timer timer;
    
    public RandomShapesPanel(){
        super();
        timer = new Timer(1500, new TimerDelayListener());
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = getWidth();
        int y = getHeight();
        int shape, x1, y1, x2, y2, width, height;
        rGen = new Random();
        for(int i = 1; i <= 175; i++){
            rColor = new Color(rGen.nextInt(256), rGen.nextInt(256), 
                    rGen.nextInt(256));
            shape = rGen.nextInt(6) + 1;
            
            switch(shape){
                case 1:
                    x1 = rGen.nextInt(x - 2) + 1; 
                    y1 = rGen.nextInt(y - 2) + 1; 
                    x2 = rGen.nextInt(x - 2) + 1; 
                    y2 = rGen.nextInt(y - 2) + 1;
                    g.setColor(rColor);
                    g.drawLine(x1, y1, x2, y2);
                    break;
                case 2:
                    x1 = rGen.nextInt(x - 1) + 1;
                    width = rGen.nextInt(51) + 10;
                    if(width + x1 > x){
                        x1 -= width;
                    }
                    y1 = rGen.nextInt(y - 1) + 1;
                    height = rGen.nextInt(51) + 10;
                    if(height + y1 > y){
                        y1 -= height;            
                    }
                    g.setColor(rColor);
                    g.drawOval(x1, y1, width, height);
                    break;
                case 3:
                    x1 = rGen.nextInt(x - 1) + 1;
                    width = rGen.nextInt(51) + 10;
                    if(width + x1 > x){
                        x1 -= width;
                    }
                    y1 = rGen.nextInt(y - 1) + 1;
                    height = rGen.nextInt(51) + 10;
                    if(height + y1 > y){
                        y1 -= height;            
                    }
                    g.setColor(rColor);
                    g.drawRect(x1, y1, width, height);
                    break;
                case 4:
                    x1 = rGen.nextInt(x - 1) + 1;
                    width = rGen.nextInt(51) + 10;
                    if(width + x1 > x){
                        x1 -= width;
                    }
                    y1 = rGen.nextInt(y - 1) + 1;
                    height = rGen.nextInt(51) + 10;
                    if(height + y1 > y){
                        y1 -= height;            
                    }
                    g.setColor(rColor);
                    g.fillRect(x1, y1, width, height);
                    break;
                case 5:
                    x1 = rGen.nextInt(x - 1) + 1;
                    width = rGen.nextInt(51) + 10;
                    if(width + x1 > x){
                        x1 -= width;
                    }
                    y1 = rGen.nextInt(y - 1) + 1;
                    height = rGen.nextInt(51) + 10;
                    if(height + y1 > y){
                        y1 -= height;            
                    }
                    g.setColor(rColor);
                    g.fillOval(x1, y1, width, height);
                    break;
            }
            
        }
    }
    
    class TimerDelayListener implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    }
}
