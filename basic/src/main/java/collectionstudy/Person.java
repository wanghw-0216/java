package collectionstudy;

import java.util.TreeMap;

/**
 * @ClassName Person
 * @Description TODO
 * @Date 2021/1/23 19:24
 * @Version 1.0
 **/
public class Person implements Comparable<Person>{
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

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.getAge()){
            return -1;
        }

        if(this.age < o.getAge()){
            return 1;
        }
        return 0;
    }
}


class test{
    public static void main(String[] args) {
        TreeMap<Person  , String> map = new TreeMap<>();
        map.put(new Person("张三" , 1) , "zhanngsan");
        map.put(new Person("张四" , 2) , "zhanngsi");
        map.put(new Person("张五" , 4) , "zhanngwu");
        map.put(new Person("张二" , 0) , "zhannger");
        map.put(new Person("张一" , -2) , "zhanngyi");

        for (Person person : map.keySet()) {
            System.out.println(person.toString());
        }

    }

}
