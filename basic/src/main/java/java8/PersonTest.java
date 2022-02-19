package java8;


import org.springframework.core.convert.converter.Converter;

public class PersonTest {
    public static void main(String[] args) {
        // TODO 将数字字符串转换为整数类型
        int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);
    }
}
