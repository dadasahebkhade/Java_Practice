package String_Program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class longest_Substring {

	public static void main(String[] args) {
		String s = "khadeap";
        int j = 0;
        int lenSubstr = 0;
        LinkedHashSet<Character> subset = new LinkedHashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
 
            if (!subset.contains(c)) {
                subset.add(c);
                lenSubstr = Math.max(lenSubstr, subset.size());
                
            } else {
                while (j < i) {
 
                    if (s.charAt(j) == c) {
                        j++;
                        break;
                    } else {
                        subset.remove(s.charAt(j));
                        j++;
                    }
                }
 
                subset.add(c);
            }
        }
        System.out.println("Original String = " + s);
        System.out.println("Longest Substring is "+subset +" Length of Longest substring = " + lenSubstr);
	}

}
