import java.util.Scanner;


public class factorial_number {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number for which you want to find factorail");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double fact=1;
		if(n>0){
		for (int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorail of "+n+" is "+fact);
		}
		
		else {
			System.out.println("Please enter positive integer number");
		}
	}

}
