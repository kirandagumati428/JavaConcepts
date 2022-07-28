package programes;

public class PalidromeNumber {

	public static void main(String[] args) {
		int n=121;
		int temp=n;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		
	if(n == rev) {
		System.out.println("palidome number");
	}else {
		System.out.println("not palidrome number");
	}
		
	}

}
