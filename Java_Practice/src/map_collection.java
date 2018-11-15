import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class map_collection {

	public static void main(String[] args) {
		
		String[] str={"Dada","Kale","Amol","Dhruvi","Rahul","Amol","Sachin","Dada","DADA"};
		Map<String,Integer> hmap=new HashMap<>();
		for(String s: str){
		boolean flag=hmap.containsKey(s);
		int count=1;
			if(flag==false){
				hmap.put(s, count);
			}
			else{
				hmap.put(s, ++count);
			}
		}
		System.out.println(hmap);
		
		  Set<Entry<String,Integer>> itr=hmap.entrySet();
		        for(Entry<String,Integer> st:hmap.entrySet()){
		        	if(st.getValue()>1){
		        		System.out.println("Duplicate Element --> "+st.getKey()+" "+ st.getValue());
		        	}
		        }
		      
	}

}
