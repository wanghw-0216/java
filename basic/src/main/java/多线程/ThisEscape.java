package 多线程;


/**
 * this 逃逸问题，多线程中会发生
 */
public class ThisEscape {
    final String a;
    static ThisEscape t;

    public ThisEscape(){
        t = this;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a = "ABC";
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            new ThisEscape();
        },"1号线程");
        Thread t2 = new Thread(() -> {
            System.out.println(ThisEscape.t.a);
        },"2号线程");
        t1.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
