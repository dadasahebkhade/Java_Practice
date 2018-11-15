import java.util.Scanner;


public class Largest_Number_between3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Please enter 3 no to find  largest among the numbers");
			Scanner  scn=new Scanner(System.in);
			int i=scn.nextInt();
			int j=scn.nextInt();
			int k=scn.nextInt();
			
			if (i==j&&j==k){
				System.out.println("All 3 Numbers are simillar");
			}
			else {
			if (i>j && i>k){
				System.out.println("Largest number is "+i);
			}
			else {
				if(j>i &&j>k){
					System.out.println("Largest number is "+j);	
					
				}
				else {
					System.out.println("Largest number is "+k);
				}
			}
			}	
	}

}
