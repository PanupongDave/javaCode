import java.util.Scanner;
public class EnumTest{
	enum Grade{G, S, U};

	public static void main(String[] args){
		String msg="Unknown";
		System.out.print("Grade Level are : ");

		for(Grade grade: Grade.values())
			System.out.printf("%2s",grade);

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter Your Grade : ");
		String g = scan.nextLine();

		for(Grade grade: Grade.values()){
			if(g.equals(grade.toString())){
				switch(grade){
					case G :  msg = "Good";
							  break;

					case S :  msg = "Satisfy";
							  break;
					case U :  msg = "Unsatisfy";
							  break;		  
				}
			}
		}
		System.out.println("Your grade is " + g +" = " + msg);
	}
}