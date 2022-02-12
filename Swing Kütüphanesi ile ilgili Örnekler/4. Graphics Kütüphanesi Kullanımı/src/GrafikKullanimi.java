
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    
        g.setColor(Color.red);
        
        g.drawRect(100, 10, 80, 80);
        
        g.fillRect(300, 300, 80, 80);
        
        g.setColor(Color.WHITE);
        
        g.drawOval(300, 500, 100, 100);
        g.fillOval(500, 500, 100, 100);
        
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(300, 100, 300, 300);
    
    }

    public GrafikKullanimi() {
        
        setBackground(Color.BLACK);
        
    }
    
    
    
    
}
