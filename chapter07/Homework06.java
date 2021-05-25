public class Homework06{
	public static void main(String[] args){
       Cale num = new Cale(5,8);
       System.out.println("和为" + num.sum());
       System.out.println("差为" + num.reduce());
       System.out.println("积为" + num.ride());
       System.out.println("商为" + num.except());
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
            System.out.println("被除数不能为0");
			return 0;
		}
	}
}