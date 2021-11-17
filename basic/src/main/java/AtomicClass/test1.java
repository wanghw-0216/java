package AtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

public class test1 {
    private AtomicInteger counter = new AtomicInteger(0);

    public void atomicAdd(){
        counter.incrementAndGet();
    }
}
