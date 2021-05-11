public class Homework05{
	public static void main(String[] args){
		//随机生成10个整数保存到数组倒序排列打印
		int[] arr = new int[10];
		for (int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		};
        //倒序打印
        System.out.println("倒序排列：");
        for (int i = arr.length - 1;i >= 0 ;i--) {
        	System.out.print(arr[i] + " ");
        }
        //求平均值
        double sum = 0;
        for (int i = 0;i < arr.length;i++) {
        	sum += arr[i];
        }
        double avr = sum / arr.length;
        System.out.println("平均值为" + avr);
        //求最大值和最大值下标
        int max = arr[0];
        int index = 0;
        for (int i = 0;i < arr.length;i++) {
        	if (max < arr[i]) {
        		max = arr[i];
        		index = i;
        	}
        }
        System.out.println("最大值为" + max);
        System.out.println("最大值下标为" + index);
        //查找里面有没有8
        for (int i = 0;i < arr.length;i++) {
        	if (arr[i] == 8) {
        		System.out.println("里面有8");
        		break;
        	}
        }
        System.out.println("里面没有8");
	}
}