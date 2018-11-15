import java.util.HashSet;
import java.util.Set;


public class remove_duplicate_string {

	public static String removeDulipcate(String[] str){
	//char[] ch=str.toCharArray();
	Set<String> setc=new HashSet<String>();

	StringBuffer sb=new StringBuffer();
	for (String c:str){
		if(setc.contains(c)==true){
			setc.add(c);
			sb.append(c+" ");
		}
		/*if(setc.add(c)==false){
			setc.add(c);
			sb.append(c);
		}
		*/				
	}
	return sb.toString();
	}
	
	
	public static void main(String[] args) {
		String[] str={"dada","kale","amol","dada"};
		System.out.println("After removing Duplicate characters string is:"+removeDulipcate(str));
		

}
}