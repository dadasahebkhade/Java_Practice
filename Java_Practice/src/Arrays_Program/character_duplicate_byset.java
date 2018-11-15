package Arrays_Program;

import java.util.HashSet;
import java.util.Set;

public class character_duplicate_byset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="dadasahebkhade";
		char[] ch=str.toCharArray();
		Set<Character> cset=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for (Character c:ch){
			if(!cset.contains(c)){
				cset.add(c);
			}
			else{
				sb.append(c);
			}
			
		}
		System.out.println("After removing duplicate character string is --> "+sb);
	}

}
