import java.util.Scanner;


public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the positive number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0){
			if(n%2==0){
				System.out.println("Given nunber "+n +" is Even" );
			}
			else {
				System.out.println("Given nunber "+n +" is odd" );
			}
		}
		else {
			System.out.println("Invalid Input ,Please enter positive number" );
		}
	}

}
