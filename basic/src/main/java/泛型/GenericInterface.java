package 泛型;

/**
 * @InterfaceName GenericInterface
 * @Description TODO
 * @Date 2021/1/21 10:07
 * @Version 1.0
 **/
interface GenericInterface<T> {
    T doSomething();
}



class userThisInterface<T> implements GenericInterface<T> {

    @Override
    public T doSomething() {
        return null;
    }
}

class userThisInterface2<T> implements GenericInterface<String>{

    @Override
    public String doSomething() {
        return "hello";
    }
}
