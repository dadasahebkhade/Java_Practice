
public class Char_Count {

	/*
	 * To count each word length from given string 
	 * 
	 */
	public static void main(String[] args) {
		
		String str="Dada kale amol";
		/*char[] c=str.toCharArray();
		
		for (int i=0;i<c.length;i++)
		
		{		
			String s="";	
			while (i <c.length && c[i]!=' ')
			{
				s=s+c[i];
				i++;
			}
			
				
		if(s.length()> 0){
			System.out.println(s +"-->"+s.length());
		}
		
		}*/
		   
	char[]	ch=str.toCharArray();
	
	for(int i=0;i<ch.length;i++){
		String s="";
		while (i<ch.length && ch[i]!=' ')
		{
			s=s+ch[i];
			i++;
		}
		
		
		System.out.println("Count of Word-- "+ s+ " is"+s.length());
	}
	
		
		
	}

}
