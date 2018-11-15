import java.util.Scanner;


public class addition_array_element {

	public static void main(String[] args) {
		System.out.println("Please specify size of array");
		//System.out.println(System.in);
		Scanner scn=new Scanner(System.in);
		int i=scn.nextInt();
		
		System.out.println("Please enter array element");
		int j[]=new int [i];
		for(int m=0;m<i;m++){
			j[m]=scn.nextInt();
		}
		
		
		int sum=0;
		for (int k=0;k<j.length;k++){
			
			sum=sum+j[k];
			
		}
		System.out.println("Sum of array element is "+ sum);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir")+ "/src/main/java/com/crm"
				+ "/qa/config/config.properties");
	}

}
