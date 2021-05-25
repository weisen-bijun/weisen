public class Homework06{
	public static void main(String[] args){

	}
}
class Employee{
	String name;
	char gender;
	int age;
	String position;
	double salary;
	public Employee(String name,char gender,int age,String position,double salary){
		this(name,gender,age);
		this.position = position;
		this.salary = salary;
	}
	public Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String position,double salary){
		this.position = position;
		this.salary = salary;
	}
}