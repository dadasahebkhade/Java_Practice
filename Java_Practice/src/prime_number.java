import java.util.Scanner;


public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number to find prime or not");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Given number is "+ i);
		boolean flag=true;
		for(int j=2;j<=i/2;j++){
			
			if(i%j==0){
				flag=false;
				break;
			}
		}
		
		if(flag==true){
			System.out.println("Given number "+i+" is prime number");
		}
		else {
			System.out.println("Given number "+i+" is not prime number");
		}
	}

}
