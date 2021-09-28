package 多线程;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @ClassName ThreadLocalExample
 * @Description TODO
 * @Date 2021/1/27 16:19
 * @Version 1.0
 **/
public class ThreadLocalExample implements Runnable {

    private static final ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(() ->new SimpleDateFormat("yyyyMMdd HHmm"));


    public static void main(String[] args) {
        ThreadLocalExample threadLocalExample = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(threadLocalExample , "--" + i);
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread.start();
        }
    }


    @Override
    public void run() {
        System.out.println("当前线程为" + Thread.currentThread().getName() + ">>>>>>>时间戳为" + format.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        format.set(new SimpleDateFormat());
    }
}
