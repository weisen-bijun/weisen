//求1-100内的不能被5整除的数并且输出一行输出五个 一共多少个
public class Homework06{
	public static void main(String[] args){
		int count = 0;
		for (int i = 1;i < 100 ;) {
			for (int j = 1;j <= 5 ;j++) {
				if (i % 5 != 0) {
					System.out.print(i + "\t");
					count++;
				}else{
					j--;
				}
				i++;
			}
		    System.out.println("");
		}
		System.out.println("个数为" + count + "个");
	}
}