/* percobaan untuk membaca masukan
 dari keyboard dengan dialog box */

import javax.swing.*;
public class R_InputDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name ?");
        System.out.println("My name is "+ name);
        System.exit(0);
    }
}
