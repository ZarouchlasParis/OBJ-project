package Assignment_001;
import javax.swing.JOptionPane;

/*
    Class that's going to create a Graphic User Interface for the users when they enter their credentials
 */
public class quiz_GUI {
    public static void main(String[] args){
    String show_name = JOptionPane.showInputDialog("Enter your name: ");
    JOptionPane.showMessageDialog(null, "Welcome to the game " + show_name);
    System.out.println("Hello "+ show_name);

    int show_age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
    JOptionPane.showMessageDialog(null, "You are " + show_age + " years old!");
        System.out.println("Looks like you are "+ show_age + " years old enough to play");

    String show_prof = JOptionPane.showInputDialog("What's your profession? ");
    JOptionPane.showMessageDialog(null, "You work as an " + show_prof + " amazing!");
        System.out.println("You work as an " + show_prof);

    String show_city = JOptionPane.showInputDialog("In which town or city do you live? ");
    JOptionPane.showMessageDialog(null, "I see, you live in " + show_city);
        System.out.println("So you live in " + show_city + " that's great");
    }
}
