public class Homework06{
	public static void main(String[] args){
       Cale num = new Cale(5,8);
       System.out.println("��Ϊ" + num.sum());
       System.out.println("��Ϊ" + num.reduce());
       System.out.println("��Ϊ" + num.ride());
       System.out.println("��Ϊ" + num.except());
	}
}
class Cale{
	double i;
	double j;
	public Cale(double i,double j) {
		this.i = i;
		this.j = j;
	}
	public double sum(){
		return i + j;
	}
	public double reduce(){
		return i - j;
	}
	public double ride(){
		return i * j;
	}
	public double except(){
		if (j != 0) {
			return i / j;
		}else{
            System.out.println("����������Ϊ0");
			return 0;
		}
	}
}