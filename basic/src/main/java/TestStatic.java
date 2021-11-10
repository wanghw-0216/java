public class TestStatic {

    TestStatic(){
        System.out.println("this is 构造方法");
    }


    {
        System.out.println("this is 非静态代码块");
    }

    static{
        System.out.println("静态代码块加载");
    }

    public static void test(){
        System.out.println("this is 静态方法");
        {
            System.out.println("this is  静态方法中的静态代码块");
        }
    }
}

class test{
    public static void main(String[] args) {
        System.out.println("调用钱");
//        TestStatic t = new TestStatic();
        TestStatic.test();
    }
}
