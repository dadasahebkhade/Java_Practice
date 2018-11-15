
public class Swapping_NoWithout_Varaiable {
// solved with temp  variable as well as without third  variables
	
	public static void additionSwap(){
		int a= -10;int b=5;
		System.out.println("Before Swapping a is "+a+" and b is "+b );
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  Swapping a is "+a+" and b is "+b );
		}
	
	 public static void multiplicationSwap(){
		 System.out.println();
		 int x=-10;int y=5;
		 System.out.println("Before Swapping x is "+x+" and y is "+y );
		 x=x*y;
		 y=x/y;
		 x=x/y;
		 
		 System.out.println("after Swapping x is "+x+" and y is "+y );
		 
	 }
		 
	 public static void tempvariable(){
		int p=-10;int q=5;
		int temp=0;
		System.out.println();
		System.out.println("Before Swapping p is "+p+" and q is "+q );
	  	temp=p;
		p=q;
		q=temp;
		System.out.println("after Swapping p is "+p+" and q is "+q );
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		additionSwap();
		multiplicationSwap();
		tempvariable();
		
		
	}

}
