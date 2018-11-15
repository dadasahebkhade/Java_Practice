import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Dadasaheb Deepak DhruvRaj Deepak dadasaheb Dhanshree Kale Amol Deepak AMol";
		String str1=str.toLowerCase();
		String[]str2= str1.split(" ");
		
		/*Map< String, Integer> storeMap= new HashMap<String,Integer >();
		 for (String name: str2){
			Integer count= storeMap.get(name);
			if (count==null){
				storeMap.put(name,1);
			}
			else{
				storeMap.put(name,++count);
							
			}
		 }
			
		Set<Entry<String,Integer>> strset=storeMap.entrySet();
		for(Entry<String,Integer> entry: strset){
			if(entry.getValue()>1){
				System.out.println("Duplicate Element is : " + entry.getKey()+ " repeated " + entry.getValue()+ " times " );
			}
			
		}
		}*/
		
		 Map<String,Integer> storeMap =new HashMap<String,Integer>();
		 
		 for(String entry :str2 ){
			Integer count =storeMap.get(entry);
			if(count==null){
				storeMap.put(entry, 1);
			   }
			else {
				storeMap.put(entry, ++count);
				 }
		 }
		 
	Set<Entry<String,Integer>> setentry =storeMap.entrySet();
		 for(Entry<String,Integer> e: setentry){
			 if(e.getValue()>1){
				 System.out.println("Duplicate Element is : " + e.getKey()+ " repeated " + e.getValue()+ " times " );
			 }
		 }
		 
		 
		
	}
}


