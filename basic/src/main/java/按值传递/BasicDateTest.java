package 按值传递;

public class BasicDateTest {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        change(num1 , num2);
        System.out.println("num1 ====" + num1);
        System.out.println("num2 ====" + num2);
    }

    //此处改变num1 和num2的值，如果为引用传递，则外层main方法中的打印也会变。
    private static void change(int num1, int num2) {
        num1 = 3;
        num2 = 4;
        System.out.println("change  num1====" +num1);
        System.out.println("change  num2====" +num2);
    }
}
