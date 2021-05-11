//下列赋值语句哪些是正确的
A)int num1 = (int)"18";//错误，字符串不可以强转为int
B)int num2 = 18.0;//错误，精度高的不可以赋值给精度低的
C)double num3 = 3d;//对
D)double num4 = 8;//对，精度低的可以赋值给精度高的
E)int i = 48;char ch = i + 1;//错误，int不可以赋值给char
F)byte b = 19;short s = b + 2;//错误，byte，short，char进行运算都会转化为int,int不可以赋值给short 