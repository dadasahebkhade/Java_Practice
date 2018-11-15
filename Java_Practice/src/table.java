import java.util.Scanner;


public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Please Enter the number between 1 to 10");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if (n>=1 && n<=10){
			int multi=1;
			for (int i=1;i<=10;i++){
				multi=1*i;
				System.out.println(n +" * "+i +"="+(n*i));
			}
			
		}
		else {
			System.out.println("Invalid Input,Please Enter the number between 1 to 10 ");
		}
	}

}
