package 多线程;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolDemo {
    public static AtomicInteger ai = new AtomicInteger();

    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {

            int a = ai.get();
            System.out.println(a);
        }

    }
}
