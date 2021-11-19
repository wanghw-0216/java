package 并发;

public class DeadLock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1){
                System.out.println(Thread.currentThread() +"获取1号资源");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() +"开始获取2号资源ing.....");
                synchronized (resource2){
                    System.out.println(Thread.currentThread() +"获取2号资源成功");
                }
            }
        },"线程A").start();

        new Thread(() -> {
            synchronized (resource2){
                System.out.println(Thread.currentThread() +"获取2号资源");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() +"开始获取1号资源ing.....");
                synchronized (resource1){
                    System.out.println(Thread.currentThread() +"获取1号资源成功");
                }
            }
        } , "线程B").start();
    }
}
