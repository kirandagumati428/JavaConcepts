package programes;

public class ReverseString {

	public static void main(String[] args) {

String s="kiran";
String rev=" ";
/*for(int i=s.length()-1;i>=0;i--) {
	char d=s.charAt(i);
	
	rev= rev+d;
	
}*/
//or
/*for (int i=0;i<s.length();i++) {
	char d=s.charAt(i);
	rev=d+rev;
}
System.out.println(rev);
	}*/
//or 
char []d=s.toCharArray();
for(char e:d) {
	rev=e+rev;
}
System.out.println(rev);
}
}