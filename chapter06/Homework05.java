public class Homework05{
	public static void main(String[] args){
		//�������10���������浽���鵹�����д�ӡ
		int[] arr = new int[10];
		for (int i = 0;i < arr.length;i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		};
        //�����ӡ
        System.out.println("�������У�");
        for (int i = arr.length - 1;i >= 0 ;i--) {
        	System.out.print(arr[i] + " ");
        }
        //��ƽ��ֵ
        double sum = 0;
        for (int i = 0;i < arr.length;i++) {
        	sum += arr[i];
        }
        double avr = sum / arr.length;
        System.out.println("ƽ��ֵΪ" + avr);
        //�����ֵ�����ֵ�±�
        int max = arr[0];
        int index = 0;
        for (int i = 0;i < arr.length;i++) {
        	if (max < arr[i]) {
        		max = arr[i];
        		index = i;
        	}
        }
        System.out.println("���ֵΪ" + max);
        System.out.println("���ֵ�±�Ϊ" + index);
        //����������û��8
        for (int i = 0;i < arr.length;i++) {
        	if (arr[i] == 8) {
        		System.out.println("������8");
        		break;
        	}
        }
        System.out.println("����û��8");
	}
}