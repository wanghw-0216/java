package this调用;

public class ThisDemo {

    public ThisDemo(){

        System.out.println("thisdemo的无参构造方法");
    }

    public ThisDemo(int a){
        System.out.println("ThisDemo的一个参数构造方法，a = "+a);
    }
    public ThisDemo(int a ,int b ){
        this(a);
        System.out.println("ThisDemo的两个个参数构造方法，a = "+a + "---b = "+b);
    }
}
