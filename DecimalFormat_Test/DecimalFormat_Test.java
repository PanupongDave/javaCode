import java.text.DecimalFormat;

public class DecimalFormat_Test{
	public static void main(String[] args){
		double payment;
		payment = 12345.00;
		System.out.println("payment - 12345.00");
		DecimalFormat nf = new DecimalFormat("#,###.00");
		System.out.println("#,###.00 - "+nf.format(payment));
		nf = new DecimalFormat("####.##");
		System.out.println("#,###.## - "+ nf.format(payment));
		payment = 0.5111;
		System.out.println("payment - 0.5111");
		nf = new DecimalFormat("#.0000");
		System.out.println("#.0000 = " + nf.format(payment));
		nf = new DecimalFormat("0.0000");
		System.out.println("0.0000 = "+ nf.format(payment));
	}
}