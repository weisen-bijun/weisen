public class Homework02{
	public static void main(String[] args){
		String arr[] = {"玄武","青龙","白虎","朱雀","麒麟"};
		A02 A = new A02();
		if (A.find(arr,"白虎") != -1) {
			System.out.println("找到了是第"+ (A.find(arr,"白虎") + 1) + "个");
		}else{
		    System.out.println("不好意思没有找到");
		}
	}
}
class A02{
	public int find(String[] arr,String str){
		for (int i = 0;i < arr.length;i++) {
			if (str.equals(arr[i])) {
				return i;
			}
		}
		return -1;  
	}
}
