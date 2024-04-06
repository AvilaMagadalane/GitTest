package demo;

public class Fibonacci {

	public static void main(String[] args) {
		int r = 5;
		int f=0, s = 1, sum;
		for(int i = 1; i<= r; i++) {
			System.out.println(f);
			sum = f+s;
			f=s;
			s=sum;
		}
	}

}
