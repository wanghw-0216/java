package java8;

public interface DefaultMethodTest {
    void normalMethod(String s);

    default String defaultMethod(String s){
        return "接口default方法返回----->" + s;
    }
}
