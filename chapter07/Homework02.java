public class Homework02{
	public static void main(String[] args){
		String arr[] = {"����","����","�׻�","��ȸ","����"};
		A02 A = new A02();
		if (A.find(arr,"�׻�") != -1) {
			System.out.println("�ҵ����ǵ�"+ (A.find(arr,"�׻�") + 1) + "��");
		}else{
		    System.out.println("������˼û���ҵ�");
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
