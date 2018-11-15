

public class Missing_Number_Array {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] ={11,12,13,14,15,16,17,19};
		int sum1=0;
		for (int i=0;i<num.length;i++){
			sum1=sum1+num[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int j=11;j<=19;j++){
			sum2=sum2+j;
		}
		System.out.println(sum2);
		
		int sum=sum2-sum1;
		System.out.println("Missing no is -->"+sum);
	}

}
