public class Homework07{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.show();
	}
}
class Dog{
	String name = "大黄";
	String colour = "黄色";
	int age = 52;
	public void show(){
		System.out.println("名字：" + this.name + " " + "颜色：" + this.colour + " " + "年龄：" + this.age);
	}
}