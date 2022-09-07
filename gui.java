import javax.swing.JOptionPane;
//creating a tiny interface
public class gui {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Name your character");
    JOptionPane.showMessageDialog(null, "Your character name is"+ name);

    String hammer = JOptionPane.showInputDialog("What is the name of your weapon ");
    JOptionPane.showMessageDialog(null, "Your weapon is "+ hammer);

    int hitpoint = Integer.parseInt(JOptionPane.showInputDialog("What is the hitpoint ?"));
    JOptionPane.showMessageDialog(null, "Your weapon's hitpoint is"+hitpoint);


      //JOptionPane.showMessageDialog(null, age);
  }  
}
