import java.math.BigInteger;
import java.util.Scanner;


public class factorial_OfBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number to find factorial");
		Scanner  sc=new Scanner(System.in);
		int j=sc.nextInt();
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=j;i++){
		fact=fact.multiply(BigInteger.valueOf(i));
	}
		System.out.println("Factoril of "+j +" is "+fact);
	}
}
