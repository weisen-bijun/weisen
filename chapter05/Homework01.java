public class Homework01{
	public static void main(String[] args){
		double money = 100000;//定义一开始的钱数
		int count = 0;//定义路口数
		while(true){
			if (money > 50000){
				money *= 0.95;
				count++;
			}else if(money >= 1000){
				money -= 1000;
                count++;
			}else{
				System.out.println("100000元能通过" + count + "个路口");
				break;
			}
		}
	}
}