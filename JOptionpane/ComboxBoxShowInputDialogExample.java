import javax.swing.*;

public class ComboxBoxShowInputDialogExample{
	public static final String[] pizzas = { "Cheese", "Pepperoni", "Sausage", "Veggie"};

	public static void main(String[] args){
		JFrame frame = new JFrame("input Dialog Example 3");
		String favoritePizza = (String) JOptionPane.showInputDialog(
			frame,
			"what is your favorite pizza?",
			"Favorite Pizza",
			JOptionPane.QUESTION_MESSAGE,
			null,
			pizzas,
			pizzas[0]
		);

		System.out.printf("Favorite pizza is %s. \n",favoritePizza);
		System.exit(0);
	}	
}