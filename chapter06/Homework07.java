//冒泡排序的代码
int arr[] = new int[9];
for (int i = 0;i < arr.length - 1;i++) {
	for (int j = 0;j < arr.length - 1 - i;j++) {
		if (arr[j] > arr[j+1]) {
			int temp = arr[j];
    		arr[j] = arr[j+1];
            arr[j+1] = temp;
		}
	}
}