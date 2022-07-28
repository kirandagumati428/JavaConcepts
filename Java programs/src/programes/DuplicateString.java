package programes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
	public static void main(String[] args) {
		String name ="kirankumarreddy";
		char[]d=name.toCharArray();
		Set<Character> s= new HashSet<>();
		Set<Character> ans=new HashSet<>();
		
		for(char num:d) {
			if(s.contains(num)) {
				ans.add(num);
		}else {
			s.add(num);
			}
		}
		System.out.println(ans);
	}

}
