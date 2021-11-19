package collectionstudy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(5);
        Integer[] str = new Integer[]{0,1};
        Object[] objects = list.toArray(str);
        System.out.println(objects.length);

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
