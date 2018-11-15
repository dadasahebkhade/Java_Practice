package String_Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class longSubString_bymap {
	
	public static void findmaxsubstring(String st){
	//String str="abcdaefghibjklcmnopqdrstuvwxyz";
	char[] ch=st.toCharArray();
	Map<Character,Integer> hmap=new LinkedHashMap<>();
	int maxsubstringlength=0;
	String s=null;
	for (int i=0;i<ch.length;i++){
		if(!hmap.containsKey(ch[i])){
			hmap.put(ch[i],i);
			
		}
		else{
			i=hmap.get(ch[i]);
			hmap.clear();
		}
		
		if (hmap.size()>maxsubstringlength ){
			maxsubstringlength=hmap.size();
			s=hmap.keySet().toString();
		}
	}
	
	
	System.out.println("Original substring is "+st);
	System.out.println("Maximum length of substring is-->"+maxsubstringlength);
	System.out.println("Maximum substring is-->"+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findmaxsubstring("abcdaefghibjklcmnopqdrstuvwxyz");
	}

}
