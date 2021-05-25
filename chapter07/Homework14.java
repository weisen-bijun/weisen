import java.util.Scanner;
import java.util.Random;
public class Homework14{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		Random r = new Random();
		System.out.println("猜拳开始！(请输入 0-石头 1-剪刀 2-布)");
		Tom tom = new Tom();
		int win = 0;
		int lose = 0;
		int[][] arr = new int[3][2];
        for (int j = 0;j < 3;j++) {
			int t = myscanner.nextInt();
			int c = r.nextInt(3);
			if (tom.guass(t,c) == 0) {
				System.out.println("你赢了");
				arr[j][0] = t;
				arr[j][1] = c;
				win++;
			}else if(tom.guass(t,c) == 1){
	            System.out.println("你输了");
	            arr[j][0] = t;
				arr[j][1] = c;
	            lose++;
			}else{
				System.out.println("平局");
				arr[j][0] = t;
				arr[j][1] = c;
			}
		}
		System.out.println("Tom" + "\t" + "电脑");
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("一共赢了" + win + "把 一共输了" + lose + "把");
	}
}
class Tom{
	public int guass(int t,int c){
		if (c != t) {
			if ((c == 0 && t == 2) || (c == 1 && t == 0) || (c == 2 && t == 1)) {
				return 0;
			}else{
				return 1;
			}
		}else{
			return 2;
		}
	}
}