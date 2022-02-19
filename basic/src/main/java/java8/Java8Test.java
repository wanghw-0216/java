package java8;

public class Java8Test {
    public static void main(String[] args) {
        DefaultMethodTest defaultMethodTest = new DefaultMethodTest() {
            @Override
            public void normalMethod(String s) {
                System.out.println("接口的正常方法");
            }
        };
        defaultMethodTest.normalMethod("1");
        System.out.println(defaultMethodTest.defaultMethod("我是接口"));
        DefaultMethodTestImpl impl = new DefaultMethodTestImpl();
        impl.normalMethod("1");
        System.out.println(impl.defaultMethod("我是实现类"));

    }
}
