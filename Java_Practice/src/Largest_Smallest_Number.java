
public class Largest_Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []i= {11,25,85,9,41,23};
			int largest=i[0];
			int smallest=i[0];
			
			for(int j=1;j<i.length;j++){
				
				if(i[j]>largest){
				largest=i[j];	
					}
				else{
					if(i[j]< smallest){
						smallest=i[j];
					}
					
				}
			}
			
			System.out.println("Largets no is-->" + largest );
			System.out.println("smallest no is -->" + smallest);
			
			
	}

}
