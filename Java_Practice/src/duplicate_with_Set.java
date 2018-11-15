import java.util.HashSet;
import java.util.Set;


public class duplicate_with_Set {

	public static void main(String[] args) {
	
		String [] str={"Dada","Kale","Amol","Dhruvi","Rahul","Amol","Sachin","Dada","DADA"};
		
		Set<String> hset=new HashSet<String>();
		StringBuffer sb=new StringBuffer();
		
		/*for(String s:str){
			boolean flag=hset.contains(s);
			if(flag==false){
				hset.add(s);
			}
			else{
				System.out.println("Duplicate string "+ s );
			}
			
		}
		*/
		
		for(String s: str) {
			if(hset.add(s)==false) {
				sb.append(s);
			}
		}
		
		System.out.println("Duplicate string "+ sb.toString() );
		
	}

}
