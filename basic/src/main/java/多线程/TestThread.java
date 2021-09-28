package 多线程;

/**
 * @ClassName TestThread
 * @Description TODO
 * @Date 2021/1/26 17:00
 * @Version 1.0
 **/
public class TestThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).run();
    }
}
