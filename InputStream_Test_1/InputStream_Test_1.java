import java.io.*;

public class InputStream_Test_1{
	public static void main(String[] args)throws IOException {
		String input;
		BufferedReader stdin = 
			new BufferedReader(
				new InputStreamReader(System.in)
				);
		System.out.print("Input Yourname ");
		input = stdin.readLine();
		System.out.println("your name is " +input);
		}
	}