package mvcexample;

// This is the yellow view.
// It displays the A component of the model (data base).
// extra comment becuase it didn't work last time
// another extra comment

import java.util.*;  // For Observer
import java.awt.*;
import javax.swing.*;

public class View3 extends JPanel
                   implements Observer {
  
    private Model model;
    private Controller2 contr;   // Parent Frame
    
    private JTextField display;
    
    // Constructor
    public View3(Controller2 contr, Model model) {
        
        // Record references to the parent controller and the model
        this.contr = contr;
        this.model = model;
        
        // Set up view GUI
        setBackground(Color.yellow);
        add(new JLabel("View3"));
        display = new JTextField("No data", 15);
        add(display);
        
        // Subscribe to the model
        model.addObserver(this);
        
    } // constructor
    
    //Notified by the model when it is altered:
    public void update(Observable o, Object arg) {
        
        // Fetch (potentially) updated information and display it
        int a = model.getDataA();
        display.setText("Model data A: " + a);
      
    } // update
    
    // Called by the controller to clear the view:
    public void clear() {
        
        display.setText("");
      
    } // clear
  
} // class View3




