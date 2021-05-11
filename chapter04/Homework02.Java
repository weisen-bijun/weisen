//试着说出下列代码的结果
public class Homework02{
	public static void main(String[] args){
		int i = 66;
		//++i先运算自加一在执行i=i+1，执行之后的++i = i = 67,即++i+i=67+67=134
		System.out.println(++i+i);//134
	}
}