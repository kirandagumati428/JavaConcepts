package programes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String[] n={"kiran","murali","kiran","murali","alok","suresh","alok"};
		Set<String> s=new HashSet<>();
		for(String d:n) {
			s.add(d);
		}
	System.out.println(s);
	

}
}
