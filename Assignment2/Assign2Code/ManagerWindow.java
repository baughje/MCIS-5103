import javax.swing.*; //This allows us to use swing components (GUI stuff)
import java.awt.event.*;
import java.awt.*;

public class ManagerWindow extends JFrame
{
    private JPanel panel;
    private JLabel managerName;
    private JTextField manName;
    private JLabel managerTitle;
    private JTextField manTitle;
    private JLabel managerAge;
    private JTextField manAge;
    private JLabel managerYearsExperience;
    private JTextField manYearsExp;
    private Jlabel managerHighestDegree;
    private JTextField manHighDegree;
    private JLabel managerSalary;
    private JTextField manSalary;
    private JLabel managerBonus;
    private JTextfield manBonus;


    public ManagerWindow()
     {

         //Window title
         setTitle("Manager");

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
      new ManagerWindow();
   }
}