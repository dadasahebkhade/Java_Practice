package Arrays_Program;

import java.util.HashSet;

class FindUnion
{
    /* Function prints union of arr1[] and arr2[]
    m is the number of elements in arr1[]
    n is the number of elements in arr2[] */
	 static void printUnion(int arr1[], int arr2[])
	    {
	        HashSet<Integer> hs = new HashSet<>();
	         
	        for (int i = 0; i < arr1.length; i++) 
	            hs.add(arr1[i]);        
	        for (int i = 0; i < arr2.length; i++) 
	            hs.add(arr2[i]);
	        System.out.println(hs);        
	    }
	     
	    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
	    static void printIntersection(int arr1[], int arr2[])
	    {
	        HashSet<Integer> hs = new HashSet<>();
	        HashSet<Integer> hs1 = new HashSet<>();
	         
	        for (int i = 0; i < arr1.length; i++) 
	            hs.add(arr1[i]);
	         
	        for (int i = 0; i < arr2.length; i++) 
	            if (hs.contains(arr2[i]))
	               System.out.print(arr2[i] + " ");
	    }
	     
	    // Driver method to test the above function
	    public static void main(String[] args) 
	    {
	        int arr1[] = {7,4,6,2,1,5,3};
	        int arr2[] = {1,4,5,6,9};
	 
	        System.out.println("Union of two arrays is : ");
	        printUnion(arr1, arr2);
	         
	        System.out.println("Intersection of two arrays is : ");
	        printIntersection(arr1, arr2);        
	    }
}