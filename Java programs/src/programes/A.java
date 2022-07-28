package programes;

public interface A {
	public void m1();
	public void m3();
	public void m4();
	public void m5();
	public interface B{
		public void m2();
	}
	class C implements B, A{

		
		
		
		@Override
		public void m3() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m4() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m5() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		C a1=new C();
		a1.m1();
		
		
	}

}
