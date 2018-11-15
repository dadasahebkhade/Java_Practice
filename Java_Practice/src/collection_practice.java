import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/*
 * It’s a good practice to declare a list instance with a generic type parameter, for example:

List<Object> listAnything = new ArrayList<Object>();

List<String> listWords = new ArrayList<String>();

List<Integer> listNumbers = new ArrayList<Integer>();

List<String> linkedWords = new LinkedList<String>();

Since Java 7, we can remove the type parameter on the right side as follows:

List<Integer> listNumbers = new ArrayList<>();
List<String> linkedWords = new LinkedList<>();



 * 
 */

public class collection_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alist=new ArrayList();
		alist.add("1");
		alist.add("dk");
		System.out.println(alist);
		
		ArrayList<String> arrList=new ArrayList<>();
		
		List <String> al=new ArrayList<>();
		al.add("dk");
		al.add("dd");
		al.add("da");
		al.add("db");
		al.add("dc");
		al.add("dd");
		al.add(3,"dz");
		
		for(String a:al){
			System.out.println(a);
		}
		
		
		List<Integer> arl=new ArrayList<Integer>();
		
		arl.add(1);
		arl.add(10);
		arl.add(20);
		arl.add(25);
		arl.add(30);
		arl.add(11);
		arl.add(35);
		
		System.out.println("*********************");
		for (Integer i: arl){
			System.out.println(i);
		}
		
		
		Map<String,Integer> hmap=new HashMap<>();
		hmap.put("AA", 1);
		hmap.put("BB", 2);
		hmap.put("CC", 3);
		hmap.put("DD", 4);
		hmap.put("EE", 5);
		hmap.put("FF", 6);
		hmap.put("GG", 7);
		
		System.out.println("*****************");
		
		for (String b:hmap.keySet()){
			System.out.println(b);
			}
		System.out.println("*****************");
		
		for(Map.Entry<String,Integer> hm: hmap.entrySet()){
			System.out.println("Key : "+hm.getKey()+"," +" Value : "+hm.getValue());
			}
		System.out.println("*****************");
		
		Iterator<String> imap	=hmap.keySet().iterator();	
		
		while(imap.hasNext()){
		String str=	imap.next();
		System.out.println(str);
		}
		
		
		
	}	
	
}
