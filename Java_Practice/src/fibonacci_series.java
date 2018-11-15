
public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=0;int j=1; int sum=0;
	System.out.print("Fibonacci series: "+i+" "+j);
	for(int k=1;k<11;k++){
		sum=i+j;
		System.out.print(" "+sum);
		i=j;
		j=sum;
		
	}
  
	System.out.print("Fibonacci series:");
 
	}

}
