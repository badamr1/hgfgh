package basic_Programs;

public class Fibinocci_Series {
	
	void fs()
	{
		int a=0, b=1;
		int count=10;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=count-2; i++)
		{
			int c= a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		
		Fibinocci_Series f = new Fibinocci_Series();
		f.fs();
		
	}

}
