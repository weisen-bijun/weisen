public class Homework03{
	public static void main(String[] args){
        Book book = new Book("��������",900);
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
		System.out.println("���ڡ�" + name +"���ļ۸�Ϊ" + price + "Ԫ");
	}
}
