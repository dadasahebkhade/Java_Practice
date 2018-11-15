import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class factors_of_number {

	public static void main(String[] args) {
		// Finding factors of 1to 100 numbers
		/*
		for (int i=1;i<=100;i++){
			System.out.println("Factors of "+ i);
			for (int j=1;j<=i;j++){
				if(i%j==0){
					System.out.println(j);
				}
			}
		}
		*/
		// Finding Factors Of given number
    	int n=78;
    	System.out.print("Factors of -->"+n+ " is "+1+" ");
		for(int k=2;k<=n/2;k++)
		{
			if(n%k==0){
				System.out.print(k+" ");
			}
		}
		// TODO Auto-generated method stub
		System.out.print(" "+n);
	}

}
