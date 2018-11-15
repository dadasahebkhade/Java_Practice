import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList_Collection {

	public static void main(String[] args) {
		
		List<Character> cl= new ArrayList<>();
		cl.add('a');
		cl.add('b');
		cl.add('c');
		cl.add('e');
		cl.add('d');
		cl.add('f');
		cl.add('g');
		cl.add('h');
		
		
		System.out.println(cl);
		System.out.println("****************************");
		for (Character c:cl){
			System.out.println("Character list -->"+ c);
		}
		
		Iterator<Character> itr=cl.iterator();
		while(itr.hasNext()){
			Character  cha='h';
		Character ch=itr.next();
		if (ch.equals(cha)){
			System.out.println("Matching Characters found-->"+ch);
		}
		}
		
	}

}
