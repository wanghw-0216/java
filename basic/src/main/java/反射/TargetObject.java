package 反射;

public class TargetObject {
    private String value;

    public TargetObject(){
        value = "helloworld";
    }

    public void publicMethod(String s){
        System.out.println("public方法输入参数为：" + s);
    }

    private void privateMethod(){
        System.out.println("private方法输入参数为:" + value);
    }
}
