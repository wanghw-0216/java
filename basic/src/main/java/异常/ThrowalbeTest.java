package 异常;

public class ThrowalbeTest {
    public static Integer test(Integer a){
        try{
            int b = a / 0;
            a = 2;
            return a;
        }catch (Exception e){
            a = 3;
            return a;
        }finally {
            System.out.println("这是finally块");
            a = 4;
        }
    }

    public static void main(String[] args) {
        int test = test(1);
        System.out.println("最终的值为" + test);
    }
}
/**
 * 这是finally块
 * 最终的值为3
 *
 * 结果证明不管return语句在哪儿，finally中的语句都会在返回之前执行。只是finally中的赋值语句无任何意义。通过字节码可以看出，代码经过编译以后，会重新设置
 * 一个变量来代替传入的参数。最终返回该方法中设置的变量。而finally块中是对传入的参数进行了重新赋值，所以返回值跟finally中的无关。
 */