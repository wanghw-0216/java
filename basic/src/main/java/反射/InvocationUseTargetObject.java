package 反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationUseTargetObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("反射.TargetObject");
        TargetObject o = (TargetObject) aClass.newInstance();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("获取的方法名分别为:" + declaredMethod.getName());
        }
        Method publicMethod = aClass.getDeclaredMethod("publicMethod" , String.class);
        publicMethod.invoke(o, "邱淑贞");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("targetObject 中的属性：" + declaredField);
            declaredField.setAccessible(true);
            declaredField.set(o , "关之琳");
        }
        Method privateMethod = aClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(o);
    }
}
