package programes;

public class SecondLargestNumber {
	public static void main(String[] args) {
		 int []a= {2,3,4,2,5,3,2,6,5,4,2,3};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if((a[i]< a[j]))
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k:a) {
		System.out.println(k);
		}}

}
