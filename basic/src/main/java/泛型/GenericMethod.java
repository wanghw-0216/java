package 泛型;

/**
 * @ClassName GenericMethod
 * @Description TODO
 * @Date 2021/1/21 10:21
 * @Version 1.0
 **/
class GenericMethod {
     <T> String getSomething(Class<T> t){
         System.out.println(t.toString());
         return t.toString();
     };


    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        String something = genericMethod.getSomething(GenericClass.class);
        System.out.println("返回结果是:"+ something);


    }


    public void pass(String name) {
        name = "hollischuang";
        System.out.println("print in pass , name is " + name);}
}



