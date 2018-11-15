
public class AnagramOrNot2 {

	
	public static void IsAnagram(){
/*	String str1="abcde";
	String str2="abcd";
	if(str1.length()==str2.length()){
		
	
	char ch[]=str1.toCharArray();
	StringBuffer sb=new StringBuffer(str2);
	//System.out.println(sb);
	 for (int i=0;i<ch.length;i++)
	 {
		   int index= sb.indexOf(""+ch[i]);
		       if(index!=-1){;
			   sb.deleteCharAt(index);
		   }
		   
	 }
	 
	 
	 if(sb.length()==0){
		 System.out.println("String are Anagram");
		 //return true;
	 }
	 else {
		 
		 System.out.println("String are not Anagram");
		 //return false;
		 
	 }
	}
	
	else {
		System.out.println("Invalid Input");
	}*/
		
		
		String str1="dadasaheb";
		String str2="bzhasadd";
		
		if(str1.length()==str2.length()){
			
		char[] ch1=	str1.toCharArray();
		//char[] ch2=str2.toCharArray();
		StringBuffer sb=new StringBuffer(str2);
		for (int i=0;i<ch1.length;i++){
	//int j= sb.indexOf(""+ch1[i]);below is the alternate way to convert indexOf output into string
			 int j= sb.indexOf(String.valueOf(ch1[i]));
			 	if(j!=-1){
			 		sb.deleteCharAt(j);
			 	}
				//System.out.println(i);
		}
		
		if(sb.length()==0){
			System.out.println("Strig are Anagram");
		}
		else {
			System.out.println("Strig are not Anagram");
		}
			
		}
		else {
			System.out.println("Invalid Input for Anagram");
		}
		
				
		
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAnagram();
			 
	}
	
	
}
