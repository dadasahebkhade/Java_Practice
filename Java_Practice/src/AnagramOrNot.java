import java.util.Arrays;


public class AnagramOrNot {
//using sort and comparing
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*String str1="aefdgbc";
		char[] ch1= str1.toCharArray();
		String str2="gbdafce";
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		Arrays.sort(ch2);
		System.out.println(ch2);
		
	boolean cha=Arrays.equals(ch1, ch2);
	if(cha==true){
		System.out.println("Strings are anagram");
	}
	else {
		System.out.println("Strings are not anagram");
	}*/
		
		
		String str1="abcdef";
		String str2="abcde";
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	boolean b=	Arrays.equals(ch1, ch2);
	
	if(b==true){
		System.out.println("Strings are anagram");
	}
	else {
		System.out.println("Strings are not anagram");
	

	}

}
}
