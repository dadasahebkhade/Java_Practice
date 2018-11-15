package String_Program;

import java.util.StringTokenizer;

public class tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java string programming";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()){
			
			System.out.println(st.nextToken());
		
		}
		
		//StringBuffer stb=new StringBuffer("Hello Word");
		

	}

		
}




