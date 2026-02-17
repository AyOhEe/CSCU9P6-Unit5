package mvcexample;

// Controller 2: displays views 3 and 4
//               (displaying A and B components of the model)
// Offers button: clear views - see below.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controller2 extends JFrame
                         implements ActionListener {
  
    private Model model;
    private View3 view3;
    private View4 view4;
    private JButton clearViews;   // For direct message to views
 
    // Constructor
    public Controller2(Model model, String title, int windowX, int windowY) {
    
        // Record reference to the model
        this.model = model;
        
        // Configure the window
        setTitle(title);
        setLocation(windowX,windowY);
        setSize(350,150);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());     // The default is that JFrame uses BorderLayout
        
        // Set up input GUI
        clearViews = new JButton("Clear views");
        window.add(clearViews);
        clearViews.addActionListener(this);
        // Create views
        view3 = new View3(this, model);
        window.add(view3);
        view4 = new View4(this, model);
        window.add(view4);
        
        // Display the frame
        setVisible(true);
        
    } // constructor
  
    // Button click handling:
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == clearViews) {
            view3.clear();
            view4.clear();
        }     
    } // actionPerformed
    
} // class Controller2


