package programes;

public class PrimeNumbers {
	public static void main(String[] args) {
		int[]a= {2,3,4,5,6,7,8,9};
		for(int b:a) {
			if(b>0) {
				for(int i=2;i<b;i++) {
			if(b%i==0) {
				System.out.println(b+"prime number is");
			}else {
				System.out.println(b+ "is not a prime number");
			}
				
				}
				}
		}
	}

}
