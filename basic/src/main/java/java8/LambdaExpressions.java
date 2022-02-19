package java8;

import org.springframework.util.CollectionUtils;

import java.util.*;

public class LambdaExpressions {
    /**
     * list比较排序
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList( "hello" , "gek" , "abcd", "hahaha");
        //老版本排序
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        //自定义的compare
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String s : list) {
            System.out.println("第二次:" + s);
        }
    }


}
