//��1-100�ڵĲ��ܱ�5���������������һ�������� һ�����ٸ�
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
		System.out.println("����Ϊ" + count + "��");
	}
}