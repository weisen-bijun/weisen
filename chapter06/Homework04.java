import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
		Scanner myscanner = new Scanner(System.in);
		int[] arr = {1,4,7,34};
		int[] arrnew = new int[arr.length + 1];
		System.out.println("请输入要插入的数：");
		arrnew[0] = myscanner.nextInt();
        for (int i = 0;i < arr.length ;i++) {
        	arrnew[i+1] = arr[i];
        }
        for (int j = 0;j < arrnew.length - 1 ;j++) {
        	if (arrnew[j] >= arrnew[j+1]) {
        		int temp = arrnew[j];
        		arrnew[j] = arrnew[j+1];
                arrnew[j+1] = temp;
        	}else{
        		break;
            }
        }
        for (int j = 0;j < arrnew.length ;j++) {
        	System.out.print(arrnew[j] + " ");
        }
	}
}