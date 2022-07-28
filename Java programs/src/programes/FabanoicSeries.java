package programes;

public class FabanoicSeries {
static int a=0;
static int b=1,c;
public static void m1() {
	for(int i=0;i<20;i++) {
		c=a+b;

		
	a=b;
	b=c;
	System.out.println(c);
	}
	
}

	public static void main(String[] args) {
		m1();
	}

}
