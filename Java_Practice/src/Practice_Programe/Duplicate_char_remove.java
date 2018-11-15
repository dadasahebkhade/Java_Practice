package Practice_Programe;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_char_remove {
	static String  removeduplicate(String str) {
		
		char[] ch=str.toCharArray();
		
		StringBuffer sb =new StringBuffer();
		Set<Character> set= new HashSet<Character>();
		
		for (Character c: ch) {
			if(set.add(c)==false) {
				sb.append(c+" ");
				
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str="dadasaheb";
		System.out.println("Removed Duplicate characters are: "+removeduplicate(str));
		
	}

}
