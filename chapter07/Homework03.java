public class Homework03{
	public static void main(String[] args){
        Book book = new Book("三国演义",900);
        book.updatePrice();
        book.info();

	}
}
class Book{
	String name;
	double price;
	public Book(String name,double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if (price > 150) {
			price = 150;
		}else if (price > 100) {
			price = 100;
		}
	}
	public void info(){
		System.out.println("现在《" + name +"》的价格为" + price + "元");
	}
}
