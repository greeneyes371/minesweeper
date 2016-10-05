import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

public class ClickEvents extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        switch (e.getButton()) {
        case 1:        //Left mouse button
            
            break;
        case 3:        //Right mouse button
        	
            break;
        default:    //Some other button (2 = Middle mouse button, etc.)
            //Do nothing
            break;
        }
    }
    public void mouseReleased(MouseEvent e) {
        switch (e.getButton()) {
        case 1:        //Left mouse button
            
            break;
        case 3:        //Right mouse button
            //Do nothing
            break;
        default:    //Some other button (2 = Middle mouse button, etc.)
            //Do nothing
            break;
        }
    }
}