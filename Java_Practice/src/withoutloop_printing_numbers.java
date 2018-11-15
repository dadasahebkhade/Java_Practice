
public class withoutloop_printing_numbers {

	
	public static void printNumbers(int i ){
		
		if(i<=10){
			System.out.println(i);
			printNumbers(i+1);
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNumbers(1);
		
	}

}
