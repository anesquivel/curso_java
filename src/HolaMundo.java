import javax.swing.*;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args){
        System.out.println("Hi, world!");
        System.out.println("Also works with tab");
        /* numbers */

        Scanner entry = new Scanner(System.in);
        float floatNum;

        System.out.println("Digit un num float: ");
        floatNum = entry.nextFloat();

        System.out.println("The number is:"+ floatNum);

        /* string */

        Scanner entryString = new Scanner(System.in);
        String stringValue;

        System.out.println("Digit a string: ");
        stringValue = entryString.next();

        System.out.println("The string is:"+ stringValue);

        /* chars */
        Scanner entryChar = new Scanner(System.in);
        char charValue;

        System.out.println("Digit a string: ");
        charValue = entryChar.next().charAt(0);

        System.out.println("The char[0] is:"+ charValue);

        /* JOptionPane */
        String stringJOption;
        int intJOption;
        char charJOption;
        double doubleJOption;

        stringJOption = JOptionPane.showInputDialog("Digit a string:");
        intJOption = Integer.parseInt(JOptionPane.showInputDialog("Digit an int:"));
        charJOption = JOptionPane.showInputDialog("Digit a char").charAt(0);
        doubleJOption = Double.parseDouble(JOptionPane.showInputDialog("Digit a double"));

        JOptionPane.showMessageDialog(null, "String is: "+stringJOption);
        JOptionPane.showMessageDialog(null, "Char is: "+charJOption);
        JOptionPane.showMessageDialog(null, "Int is: "+intJOption);
        JOptionPane.showMessageDialog(null, "Double is: "+doubleJOption);

    }
}
