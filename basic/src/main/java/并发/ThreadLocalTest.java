package 并发;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalTest {
    public static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmm");
    public static final ThreadLocal<SimpleDateFormat> format2 = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(new Random().nextInt(1000));
            new Thread(() ->{
                try {
                    System.out.println(Thread.currentThread().getName() + "非threadLocal的format is-----" + format.toPattern());
                    System.out.println(Thread.currentThread().getName() +"threadLocal的format is-----" + format2.get().toPattern());
                    Thread.sleep(new Random().nextInt(1000));
                    format2.set(new SimpleDateFormat("yymmdd"));
                    format = new SimpleDateFormat("yymmdd");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } , "Thread" + i).start();
        }
    }

}
