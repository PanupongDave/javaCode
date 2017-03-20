import javax.swing.*;

public class JOptionPaneShowInputDialogExample1{
	public static void main(String[] args){
		JFrame frame = new JFrame("InputDialog Example #1");

		String name = JOptionPane.showInputDialog(frame,"What's your name?");

		System.out.printf("The user's name is '%s'.\n", name);
		System.exit(0);
	}	
}