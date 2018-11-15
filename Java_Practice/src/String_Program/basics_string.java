package String_Program;

import java.util.LinkedHashMap;

public class basics_string {

	public static void 	longSubString(String str){
		
	char charray[]=str.toCharArray();
	int maxlensubstring=0;
	String maxsubString=null;
	
	
	LinkedHashMap<Character,Integer> lmap=new LinkedHashMap<Character,Integer>();
	 for (int i=0;i<charray.length;i++){
		char ch= charray[i];
		
		if(!lmap.containsKey(ch)){
			lmap.put(ch, i);
		}
		else{
			i=lmap.get(ch);
			lmap.clear();
		}
		
		if(lmap.size()> maxlensubstring){
			maxlensubstring=lmap.size();
			maxsubString=lmap.keySet().toString();
		}
		
		
		
	 }
	 
	 System.out.println("Maximum substring -->"+ maxsubString);
	 System.out.println("Maximum length of Substring--> "+ maxlensubstring);
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		longSubString("abcdeaefaijblmkn");
		
	}
	

}
