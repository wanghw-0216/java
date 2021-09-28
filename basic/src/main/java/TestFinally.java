
/**
 * @ClassName TestFinally
 * @Description TODO
 * @Date 2021/2/3 10:16
 * @Version 1.0
 **/
public class TestFinally {
    private myBean myBean = new myBean();

    public static void main(String[] args) {
        TestFinally testFinally = new TestFinally();
        TestFinally.myBean myBean = testFinallyA(null, testFinally);

//        double v = testFinallyA(null ,testFinally);
        System.out.println("参数为null的时候，返回应该为第一次异常------>" + myBean.getName());
    }

    class  myBean{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static TestFinally.myBean testFinallyA(String nStr, TestFinally testFinally) {
        TestFinally.myBean myBean = testFinally.myBean;
        try {
            System.out.println("Try block! ");
            double sqrt = getSqrt(nStr);
            myBean.setAge(0);
            return myBean;
        } catch (MyFirstException e1) {
            System.out.println("Catch MyFirstException block!");
            System.out.println("Exception: " + e1.getMessage());
            myBean.setAge(1);

            return myBean;
        } catch (MySecondException e2) {
            System.out.println("Catch MySecondException block!");
            System.out.println("Exception: " + e2.getMessage());
            myBean.setAge(2);

            return myBean;
        } finally {
            System.out.println("我是finally 块");

        }
    }

    public static double getSqrt(String nStr) throws MyFirstException, MySecondException {
        if (nStr == null) {
            throw new MyFirstException("输入的字符串不能为空！");
        }
        double n = 0;
        try {
            n = Double.parseDouble(nStr);
        } catch (NumberFormatException e) {
            throw new MyFirstException("输入的字符串必须能够转化成数字！");
        }
        if (n < 0) {
            throw new MySecondException("输入的字符串转化成的数字必须大于等于0！");
        }
        return Math.sqrt(n);
    }


    static class MyFirstException extends Exception{
        private String message;
        public MyFirstException(String message){
            this.message = message;
        }


    }


    static class MySecondException extends Exception{
        private String message;
        public MySecondException(String message){
            this.message = message;
        }
    }

}
