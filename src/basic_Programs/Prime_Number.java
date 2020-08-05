package basic_Programs;

public class Prime_Number {

	void prime() {
		int n = 23;
		int flag = 0;

		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if(flag ==0) {
			System.out.println(n + " is a prime number");
			}
		}
	}

	public static void main(String[] args) {

//		System.out.println("prime number");
//		
//		System.exit(0);
		
		Prime_Number pm = new Prime_Number();
		pm.prime();
		
	

	}

}
