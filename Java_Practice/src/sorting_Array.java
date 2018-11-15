import java.util.Arrays;
import java.util.Collections;




public abstract class sorting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] str={"A","Z","B","Y","C","X","D"};
			System.out.println("Before Sorting Array values");
			for(String s: str){
				System.out.print(s);
				}
			
			Arrays.sort(str);
			System.out.println();
			System.out.println("After Sorting Array values");
			for(String s: str){
				System.out.print(s);
				}
			System.out.println();
			System.out.println("Reverse  Sorting Array values");
			Arrays.sort(str, Collections.reverseOrder());
		
			for(String s: str){
				System.out.print(s);
				}
	}
	
	
	

}
