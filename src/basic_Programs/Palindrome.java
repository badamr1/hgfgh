package basic_Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int n=1212;
		int temp;
		int sum=0;
		temp = n;
		
		while(n>0) {
			int rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;			
		}
		
		if(temp==sum) {
			System.out.println(temp + " is a palindrome");
		}else {
			System.out.println(temp + " is not a palindrome");
		}
		
	}
}
