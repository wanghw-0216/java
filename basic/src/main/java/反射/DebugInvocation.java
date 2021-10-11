package 反射;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugInvocation implements InvocationHandler {

    private final Object target;

    public DebugInvocation(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method " + method.getName());
        method.invoke(target , args);
        return null;
    }
}
