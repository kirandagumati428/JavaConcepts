package programes;

public class MergeString {
	
	static String s="kiran";
	static int a=12345;
	public static void m1() {
	
		char[]d=s.toCharArray();
String c=Integer.toString(a);
	char e[]=c.toCharArray();
		for (int i=0;i<5;i++) {
			System.out.print(d[i]+""+e[i]+"  	");
		}
	
	}
	
	public static void main(String[] args) {
		m1();
	}

}
