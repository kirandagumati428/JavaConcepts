package programes;

public class MethodOverloadind {
//	public  static void  m1(int a) {
//		System.out.println("print int"+a);
//	}
	public static void m1(String b) {
		System.out.println("print String"+b);
	}
public   void  m1(float c) {
		System.out.println("print float"+c);
	}
//	public  void m1(double d) {
//		System.out.println("print double"+d);
//	}
//	
	public static void main(String[] args) {
	m1("kiran");
	MethodOverloadind m= new MethodOverloadind();
		//m.MethodOverloadind.m1(2);
		//MethodOverloadind.m1("465644964");m1(8);
		m.m1(5);
		//m.m1(8.0);
	}

}
