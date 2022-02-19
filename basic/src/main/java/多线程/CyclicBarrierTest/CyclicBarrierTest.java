package 多线程.CyclicBarrierTest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    static CyclicBarrier cyclicBarrierTest = new CyclicBarrier(5, new Runnable() {
        @Override
        public void run() {
            System.out.println("人到齐了开会吧");
        }
    });
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
         new kaihuiThread().start();
        }

    }

    static class kaihuiThread extends Thread{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "到了");
            try {
                cyclicBarrierTest.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
