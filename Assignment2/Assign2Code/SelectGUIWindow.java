import javax.swing.*; //This allows us to use swing components (GUI stuff)
import java.awt.event.*;
import java.awt.*;

public class SelectGUIWindow extends JFrame
{
    private JPanel panel;
    private ButtonGroup radioButtonGroup;
    private JRadioButton employeeButton;
    private JRadioButton managerButton;
    final int WINDOW_WIDTH = 350; //Window width in pixels
    final int WINDOW_HEIGHT = 250; //Window height in pixels
    
    /**
     * Window Constructor
     */

     public SelectGUIWindow()
     {

         //Window title
         setTitle("Baugh MCIS5103 Assignment#2");

         //Set the size
         setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

         //Close button terminates the program
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         //Build a panel and add it to the JFrame
         buildPanel();

         //Add panel to the content pane
         add(panel);         

         //May we see it?
         setVisible(true);
   }

   private void buildPanel()
   {

       employeeButton = new JRadioButton("Employee");
       managerButton = new JRadioButton("Manager");

       radioButtonGroup = new ButtonGroup();
       radioButtonGroup.add(employeeButton);
       radioButtonGroup.add(managerButton);

       panel = new JPanel();
       panel.add(employeeButton);
       panel.add(managerButton);

       employeeButton.addActionListener(new RadioButtonListener());
       managerButton.addActionListener(new RadioButtonListener());
   }

   private class RadioButtonListener implements ActionListener
   {
       public void actionPerformed(ActionEvent e)
       {
           if (employeeButton.isSelected())
           {
               public class EmployeeWindow
               {
                   public static void main(String[] args)
                   {
                   EmployeeWindow wc = new EmployeeWindow();
                   }   
               }
           }
           else if (managerButton.isSelected())
           {
                public class ManagerWindow
               {
                   public static void main(String[] args)
                   {
                   ManagerWindow wc = new ManagerWindow();
                   }   
               }
           }
       }

    /**
    *  This embedded main method creates an instance of the
    *  SelectGUIWindow class, displaying its window.
   */
   
   public static void main(String[] args)
   {
      new SelectGUIWindow();
   }
}
}