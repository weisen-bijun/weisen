public class Homework07{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.show();
	}
}
class Dog{
	String name = "���";
	String colour = "��ɫ";
	int age = 52;
	public void show(){
		System.out.println("���֣�" + this.name + " " + "��ɫ��" + this.colour + " " + "���䣺" + this.age);
	}
}