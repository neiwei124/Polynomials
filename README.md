# Polynomials

package linegraph;
import javax.swing.*;
import java.awt.*;

public class LineGraph extends JFrame{
    double slope = 1, yInt = 11; 
    static int gSize = 1000;
    int xMin = -10, xMax = 10, yMin = -10, yMax = 10;
    
    //i thought these would be useful but jokes
    public int drawX(int x){
        return 50*x+500;
    }
    
    public int drawY(int y){
        return -50*y+500;
    }
    
    @Override
    public void paint(Graphics g){
        double fx;
        g.setColor(Color.white);
        g.fillRect(0, 0, gSize, gSize);
        
        g.setColor(Color.red);
        g.drawLine(drawX(xMin), drawY(0), drawX(xMax), drawY(0));
        g.drawLine(drawX(0), drawY(yMin), drawX(0), drawY(yMax));
        
        g.setColor(Color.black);
        
        for (double x = xMin; x <= xMax; x += 0.005) {
            fx = Math.pow(x, 3) - 2*Math.pow(x, 2) - 3*x;
            int xPos = (int)(50*x + 500);
            int yPos = (int)(-50*fx + 500);
            g.fillRect(xPos, yPos, 1, 1);
            
        }
    }

    public static void main(String[] args) {
        LineGraph lg = new LineGraph();
        
        lg.setTitle("ladslfjsdflgkjh");
        lg.setSize(gSize, gSize);
        lg.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lg.setBackground(Color.black);
        lg.setVisible(true);
        
    }
}
