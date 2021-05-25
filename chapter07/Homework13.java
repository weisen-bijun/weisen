public class Homework13{
	public static void main(String[] args){
		PassObject o = new PassObject();
		Circle o1 = new Circle();
        o.printAreas(o1,5);
	}
}
class Circle{
	double radius;
	public double findArea(double R){
		radius = R;
        return radius * radius * Math.PI;
	}
}
class PassObject{
	public void printAreas(Circle c,int times){
		System.out.println("Radius" + "\t" + "Area");
		for (double i = 1;i <= times;i++){
			System.out.println(i + "\t" + c.findArea(i));
		}
	}
}