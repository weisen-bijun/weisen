public class Homework04{
	public static void main(String[] args){
		//姓名、爱好用字符串String，年龄、成绩用int和double，性别用字节char。
		String name = "魏森";
		int age = 22;
		double score = 383;
		char gender = '男';
		String hobby = "健身打游戏";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n" + name
		                   + "\t" + age + "\t" + score + "\t" + (char)gender + "\t" + hobby);

	}
}