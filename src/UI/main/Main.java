package UI.main;

import javax.swing.JFrame;

/**
 *
 * @author: Felipe Farias
 * Date: 27/05/2020 (DD/MM/YYY)
 * 
 * Notes:
 *      - Frame used for controlling the running state
 *      - 
 *      - 
 */
public class Main {

    
    public static void main(String[] args) {
        //Init main frame
        
        
        mainFrame frame = new mainFrame();
       
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    
}
