

//Incorporateed logic in a single programma of length checking of array 
//and same number in Array  to check second  highest numbers 
public class highNumber {

	static void  secondLargest(int[] input)
    {
       
		if(input.length<=1)
		{
			System.out.println("Invalid Input to find second largest element ");
		}
		
      // if(input.length >1)
		else
       {
	       int count=input.length-1;
	  	   int sum=0;
		 			 
					 for (int j=1;j<input.length;j++)
					 {
						 
						 if (input[j]==input[0])
						 {
							 sum=sum++;
							 
						 }
						 
					  }
					 
					if (sum==count)
					{
						
						System.out.println("All elelemnt in array are duplicate, hence can't found second higest number");
					}
			else {
	
				int firstLargest, secondLargest;
				
				if(input[0] > input[1])
		        {
		            //If first element is greater than second element
		 
		            firstLargest = input[0];
		 
		            secondLargest = input[1];
		        }
		        else
		        {
		            //If second element is greater than first element
		 
		            firstLargest = input[1];
		 
		            secondLargest = input[0];
		        }
		 
		        //Checking remaining elements of input array
		 
		        for (int i = 2; i < input.length; i++)
		        {
		            if(input[i] > firstLargest)
		            {
		                //If element at 'i' is greater than 'firstLargest'
		 
		                secondLargest = firstLargest;
		 
		                firstLargest = input[i];
		            }
		            else if( input[i] > secondLargest)
		            {
		                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
		 
		                secondLargest = input[i];
		            }
		        }
		 
		        System.out.println("second largest number is -->" +secondLargest);
		        
	       }
		
       }
			
}
	
		
		public static void main(String args[]){  
				
		 secondLargest(new int[] {10,10,10,40,50,10,5});
		 
			}
		

}
