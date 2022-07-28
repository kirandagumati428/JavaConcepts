package programes;

public class VowelString {

	public static void main(String[] args) {
	/*	String s="welcome";
		int count=0;
		char[]d=s.toCharArray();
		for(char c:d) {
			if(c=='a'||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
				System.out.println(c+ ":is vowel");
				count++;
			}
		}
System.out.println(count);
	}

}*/
		
//_____________ *and*____________
String s[]= {"kiran","siva","shanta","kishore"};
for(String str:s) {
	//modification of string
	char[]d=str.toCharArray();
	int count=0;
	for(char c:d) {
		if(c=='a'||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
			System.out.println(c+ ":is vowel");
			count++;
	}
}
	System.out.println(count);
	}
	}}

