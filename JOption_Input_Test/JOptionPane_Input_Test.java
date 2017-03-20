import javax.swing.JOptionPane;
public class JOptionPane_Input_Test{
	public static void main(String[] args){
		String data = 
			JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Your name is "+ data);
	}
}