public class Homework01{
	public static void main(String[] args){
		double money = 100000;//����һ��ʼ��Ǯ��
		int count = 0;//����·����
		while(true){
			if (money > 50000){
				money *= 0.95;
				count++;
			}else if(money >= 1000){
				money -= 1000;
                count++;
			}else{
				System.out.println("100000Ԫ��ͨ��" + count + "��·��");
				break;
			}
		}
	}
}