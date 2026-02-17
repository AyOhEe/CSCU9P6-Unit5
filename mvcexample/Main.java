package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller2 c2 = new Controller2(model); // Create second controller
        Controller1 c1 = new Controller1(model, "Controller 1"); // Create first controller
        
    } // main
  
} // Main
