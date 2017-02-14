import javax.swing.*; //This allows us to use swing components (GUI stuff)

public class ShowWindow 
{
    
     public static void main(String args[])
     {
         final int WINDOW_WIDTH = 350; //Window width in pixels
         final int WINDOW_HEIGHT = 250; //Window height in pixels
         
         //Create a Window
         JFrame window = new JFrame();

         //Window title
         window.setTitle("Baugh MCIS5103 Assignment#2");

         //Set the size
         window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

         //Close button terminates the program
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //May we see it?
         window.setVisible(true);
   }
}