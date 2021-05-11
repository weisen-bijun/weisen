public class Homework08{
	public static void main(String[] args){
		double sum = 0;
		int i = 1;
		for (;i <= 100 ;i++) {
            sum += ((-1)^(i-1)) * (1.0 / i);
		}
		System.out.println("ºÍÎª" + sum);
	}
}