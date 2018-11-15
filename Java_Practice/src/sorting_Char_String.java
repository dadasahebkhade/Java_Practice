import java.util.Arrays;
import java.util.Collections;


public class sorting_Char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sandeep";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.print("Ascending order -->");
		for(Character c:ch)
		{
			System.out.print(c);
		}
		System.out.println();
		System.out.print("Descending order-->");
		for(int i=ch.length-1;i>=0;i--){
			
			System.out.print(""+ch[i]);
		}
	}

}
