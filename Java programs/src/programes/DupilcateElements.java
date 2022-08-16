package programes;

import java.util.HashSet;
import java.util.Set;

public class DupilcateElements {
	static int a[]= {2,3,4,2,5,3,2,6,5,4,2,3};
	static int count=0;
	//static int sum=0;
	/*public static void m2() {
	
		for(int i =0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&&(i!=j)) {
					System.out.println("the dipicate elements is:"+a[j]+" ");
				}
			}}
		}
		*/
		
		public static void main(String[] args) {
			
	


	Set<Integer> s=new HashSet<>();
	Set<Integer> ans=new HashSet<>();
	for(int num:a) {
		if (s.contains(num)) {
			ans.add(num);
			count++;
				
		}else {
			s.add(num);
		}
		
	}
	System.out.println(ans);
	System.out.println(count);
	//System.out.println();
}
		}
	
	
	
	
	
