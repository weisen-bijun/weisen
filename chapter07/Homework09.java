public class Homework09{
	public static void main(String[] args){
		Music music = new Music();
		for (int i = 0;i < music.play().length;i++ ) {
			System.out.print(music.play()[i] + " ");
		} 
	}
}
class Music{
	String name = "»¨º£";
	String times = "5:30";
	public String[] play(){
		String arr[] = new String[2];
		arr[0] = this.name;
		arr[1] = this.times;
        return arr;
	}
}