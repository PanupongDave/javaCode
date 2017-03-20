import java.util.Scanner;
import java.util.ArrayList;

class product_detail{
	String pcode, date, id, size,name;
	int n;
	ArrayList code = new ArrayList();

	void inputdata(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product code => ddmmyyyy0000MBreeze : (Press x to Exit)");
		do{
			System.out.print("product code : ");
			pcode = scan.nextLine();

			if(!(pcode.equals("x"))){
				code.add(pcode);
			}
		}while(!(pcode.equals("x")));
	}

	void showdata(){
		if(code.size() > 0){
			System.out.printf("%-8s%-6s%-5s%-20s\n","date","id","size","name");

			for(int i =0; i<code.size(); i++){
				date = getinfo(code.get(i).toString(),0,8);
				id 	 = getinfo(code.get(i).toString(),8,12);
				size = getinfo(code.get(i).toString(),12,13);
				name = getinfo(code.get(i).toString(),13,
								code.get(i).toString().length());
				System.out.printf("%-8s%-6s%-5s%-10s\n",date,id,size,name);	
			}
		}
	}

	String getinfo(String code, int a, int b){
		String info = code.substring(a,b);
		return info;
	}
}
public class ProductCode{
	public static void main(String[] args){
		product_detail product = new product_detail();
		product.inputdata();
		product.showdata();
	}
}