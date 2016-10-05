import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame minesweeperFrame = new JFrame("Minesweeper Grid");
        minesweeperFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        minesweeperFrame.setLocation(400, 150);
        minesweeperFrame.setSize(400, 400);
        
        //new interface of the game, 9x9
        MinesweeperInterface minesweeperPanel = new MinesweeperInterface();
        minesweeperFrame.add(minesweeperPanel);

        //ClickEvents.java
        // create new object of the ClickEvents class
        ClickEvents minesweeperClickEvent = new ClickEvents();
        
        
        // listening for mouse click events 
        minesweeperFrame.addMouseListener(minesweeperClickEvent);

        
        //Sets the minesweeperFrame to visible
        minesweeperFrame.setVisible(true);
    }
}