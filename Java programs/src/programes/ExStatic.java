package programes;

public class ExStatic {
	public static void m1() {
		System.out.println("static method");
	}
	public void m2() {
		System.out.println("Non-static method");
	}
	
	public static void main(String[] args) {
		//ExStatic.m1();
		ExStatic s=new ExStatic();
		s.m2();
		s.m1();
		
	}

}
