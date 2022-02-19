package java8;

public interface PersonFactory<P extends Person> {
//    P create();

    P create(String name);

//    P create(String name, Integer age);
}


