import java.util.Scanner;


public class prime_factors {

	
		// TODO Auto-generated method stub
		
		 
		    public static void main (String[] args){
		    	
		    	System.out.println("Enter the number for factors");
				Scanner scn=new Scanner(System.in);
				int num=scn.nextInt();
				//System.out.println("Given number is "+ num);
				boolean flag;
				System.out.print("Prime factors of "+num +" is" +" 1");
				for(int i=2; i<=num; i++)
			    {
			        /* Check 'i' for factor of num */
					
			        if(num%i==0)
			        {
			            
			        	
			            flag = true;
			            for(int j=2; j<=i/2; j++)
			            {
			                if(i%j==0)
			                {
			                    flag=false;
			                    break;
			                }
			            }

			            /* If 'i' is Prime number and factor of num */
			            if(flag==true)
			            {
			               System.out.print("  "+ i);
			            }
			        }
			    }
		    	
		    	
		    }
	}


