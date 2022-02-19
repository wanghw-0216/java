package java8;

public class Person {
    private String name;

    private Integer age;

    Person(){
        System.out.println("无参构造方法");
    }

    Person(String  name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    Person(String name , Integer age){
        System.out.println("两个参数的构造方法");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
