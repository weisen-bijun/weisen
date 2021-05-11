public class Homework04{
	public static void main(String[] args){
		int n = 153;
		int a = n / 100;
		int b = (n / 10) % 10;
        int c = n % 10;
        if ( a*a*a + b*b*b + c*c*c == n){
        	System.out.println(n + "ÊÇË®ÏÉÊı");
        }
	}
}