package programes;

public class PrimeNumber {
public static void main(String[] args) {
	int no=11;
	int temp=0;
	for(int i=2;i<no-1;i++) {
		
		if(no%i==0) {
			temp=temp+1;
		}
	}
	System.out.println(temp);
	
	if(temp==0) {
		System.out.println("prime number");
	}else {
		System.out.println("not prime number");
	}
}
}
