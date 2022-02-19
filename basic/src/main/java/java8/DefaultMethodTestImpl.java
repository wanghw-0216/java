package java8;

public class DefaultMethodTestImpl implements DefaultMethodTest{
    @Override
    public void normalMethod(String s) {
        System.out.println("接口实现类的正常方法");
    }
}
