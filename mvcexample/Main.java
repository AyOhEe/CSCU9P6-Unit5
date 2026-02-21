package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
//        Controller1 c1 = new Controller1(model); // Create first controller
//        Controller2 c2 = new Controller2(model); // Create second controller
//        Controller2 c3 = new Controller2(model); // Create third controller
//        Controller2 c4 = new Controller2(model); // Create fourth controller
//        
//        //Multiple Controller1 instances
        Controller1 c1a = new Controller1(model,40,40); // Create first controller
        Controller1 c1b = new Controller1(model,400,40); // Create second controller
        Controller1 c1c = new Controller1(model,760,40); // Create third controller
         //Multiple Controller1 instances
        Controller2 c2a = new Controller2(model,40,200); // Create first controller
        Controller2 c2c = new Controller2(model,400,200); // Create second controller 
        Controller2 c2b = new Controller2(model,760,200); // Create third controller
        
        
    } // main
  
} // Main