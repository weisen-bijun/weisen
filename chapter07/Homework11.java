public class Homework11{
	public static void main(String[] args){
    test t1 = new test();
    t1.method();
	}
}
class test{
	public double method(double i,double j){
        return i * j;
	}
	public double method(double i,int j){
   		return i * j;
	}
	public void method(){
		System.out.println(method(method(10.0,20.0),100));
	}
}
