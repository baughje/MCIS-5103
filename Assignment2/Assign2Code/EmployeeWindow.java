import javax.swing.*; //This allows us to use swing components (GUI stuff)
import java.awt.event.*;
import java.awt.*;

public class EmployeeWindow extends JFrame
{
    private JPanel panel;
    private JLabel employeeName;
    private JTextField empName;
    private JLabel employeeTitle;
    private JTextField empTitle;
    private JLabel employeeAge;
    private JTextField empAge;
    private JLabel employeeRaise;
    private JTextfield empRaise;

    public EmployeeWindow()
     {

         //Window title
         setTitle("Employee");

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







public static void main(String[] args)
   {
      new EmployeeWindow();
   }

}