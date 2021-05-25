public class Homework01{
	public static void main(String[] args){
		double arr[] = {8.5,88.3,55.7,12.8};
		A01 A = new A01();
        System.out.println("double数组的最大值为" + A.max(arr));
	}
}
class A01{
	public double max(double arr[]){
		double max = arr[0];
		for (int i = 0;i < arr.length - 1;i++) {
			if (arr[i] < arr[i+1]) {
				max = arr[i+1];
			}
		}
		return max;
	}
}