import java.io.*;

public class InputStream_Test_3{
	public static void main(String[] args)throws IOException{
		String input;
		BufferedReader stdin =
			new BufferedReader(new InputStreamReader(System.in));
		System.out.print("input Money Baht>>> ");
		input = stdin.readLine();
		double money = Double.parseDouble(input);
		System.out.print("input Chang Baht-Dollar here>>");
		input = stdin.readLine();
		double dollar_rate = Double.parseDouble(input);
		System.out.println("Chang dollar " + 
			(money/dollar_rate)+ "dollar");
	}
}