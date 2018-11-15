package String_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicate_string_bymap {

	public static void main(String[] args) {
		String[] str={"Dada","DK","Kale","ABC","XYZ","DK","Kale","Dk","Dada","ABC","ABC","Dada","PQR","ABC","ABC","Dada"};
		
	Map<String,Integer> hmap=new HashMap<>();
	
	for(String s:str){
		
		if(hmap.containsKey(s)==false){
			hmap.put(s, 1);
			}
		else {
				int i=hmap.get(s);
			
				hmap.put(s, ++i);	
			}
		  
		}
			
	

	
		Set<Entry<String,Integer>> set	=hmap.entrySet();
		System.out.println("Duplicate Entries in array :");
		Iterator<Entry<String,Integer>> itr=set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String,Integer> map	=itr.next();
			
			if (map.getValue()> 1) {
			System.out.println(map.getKey() +" " +map.getValue());
			
			}
			
		}
		
		
	/*Set<Entry<String,Integer>> set=hmap.entrySet();
		for(Entry<String,Integer> ent:hmap.entrySet()){
			if(ent.getValue()>1){
				System.out.println(ent.getKey()+" "+ent.getValue());
			}
		
		}*/
	}

}
