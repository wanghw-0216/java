package 泛型;

/**
 * @ClassName GenericClass
 * @Description 泛型类的使用
 * @Date 2021/1/21 10:04
 * @Version 1.0
 **/
class GenericClass<T> {

    private T key;
    public GenericClass(T t){
        this.key = t;
    }

    @Override
    public String toString() {
        return "这个是泛型类";
    }
}



class userGenericClass{
    GenericClass<String> genericClass = new GenericClass<>("11111");
}