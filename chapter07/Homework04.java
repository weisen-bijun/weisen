public class Homework04{
	public static void main(String[] args){
		A03 a = new A03();
		int ar[] = {1,3,5,78};
        System.out.println("复制的数组如下");
        for (int i = 0;i < a.copyArr(ar).length;i++) {
        	System.out.print(a.copyArr(ar)[i] + " ");
        }
    }
}
class A03{
	public int[] copyArr(int arr[]){
		int arr1[] = new int[arr.length];
		for (int i = 0;i < arr.length;i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
}