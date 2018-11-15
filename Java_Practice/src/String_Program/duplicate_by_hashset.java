package String_Program;

import java.util.HashSet;
import java.util.Set;

public class duplicate_by_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] str={"Selenim","JS","Java","C","C++","Java","JS"};
			Set<String> set=new HashSet<>();
			for(String s:str){
				if(!set.contains(s)){
					set.add(s);
				}
				else {
					System.out.println("Duplicate element-->"+s);
				}
			}
	}

}
