import java.util.Scanner;
class coins{
	int ten,five,one;
}
class ExchageCoin{
	public void findCoin(coins c,int m){
		c.ten = m/10;
		c.five = m%10/5;
		c.one = m%10%5;
	}
}

public class Coin_By_Ref{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("Input Money: ");
		int money = scan.nextInt();
		
		coins coin = new coins();
		ExchageCoin coinData = new ExchageCoin();
		coinData.findCoin(coin,money);
		System.out.println("Money "+money + " Bath Chage to "+
			"Ten is"+ coin.ten + " Coins Five is "+coin.five+
			" Coins One is " + coin.one+" Coins");
	}
}