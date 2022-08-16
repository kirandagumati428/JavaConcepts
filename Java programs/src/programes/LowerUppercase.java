package programes;

public class LowerUppercase {

	public static void main(String[] args) {
		String s="Welcome To AutomationTesting";
		String lower="";
		String upper="";
		int low=0;
		int upp=0;
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			//System.out.println(i);
			if(c>=65 && c<=90) {
				upper=upper+c;
				upp++;
			}else {
				lower=lower+c;
				low++;
			}
			
			
		}	
		
		System.out.println(upper);
		System.out.println(lower);
		System.out.println("upper"+upp);
		System.out.println("lower"+low);
		
		
		
		
		
	}

	}

