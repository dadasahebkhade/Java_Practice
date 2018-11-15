import java.util.HashSet;
import java.util.Set;


public class remove_duplicate {

	public static String removeDulipcate(String str){
	//String str="dhruvd";
	char[] ch=str.toCharArray();
	Set<Character> setc=new HashSet<Character>();
	StringBuffer sb=new StringBuffer();
	for (Character c:ch){
		/*if(setc.contains(c)==false){
			setc.add(c);
			sb.append(c);
		}*/
		if(setc.add(c)==false){
			setc.add(c);
			sb.append(c);
		}
						
	}
	return sb.toString();
	}
	
		
	
	
	public static void main(String[] args) {
		String str="sandeeap";
		System.out.println("After removing Duplicate characters string is:"+removeDulipcate(str));
		
		
		
	}

}

