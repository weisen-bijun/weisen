public class Homework05{
	public static void main(String[] args){
	Circle o = new Circle();
	double r = 3;
	System.out.println("圆的周长为" + o.C(r));
	System.out.println("圆的面积为" + o.S(r));	
	}
}
class Circle{
	double R;
	public double C(double r){
		this.R = r;
		return 2 * this.R * Math.PI;
	}
	public double S(double r){
		this.R = r;
		return this.R * this.R * Math.PI;
    }
}