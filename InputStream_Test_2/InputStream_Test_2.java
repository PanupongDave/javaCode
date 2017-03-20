import java.io.*;

public class InputStream_Test_2{
	public static void main(String[] args)throws IOException{
		String input;
		try{
			BufferedReader stdin =
				new BufferedReader(
					new InputStreamReader(System.in)		
				);
			System.out.print("input your massage >>>>");
			input = stdin.readLine();
			System.out.println("Your Massage is "+input);
		}
		catch (IOException e){
			System.out.print(e);
		}
	}
}