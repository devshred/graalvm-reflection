import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        if (args.length < 2) {
            System.out.println("pass name of class and method");
        } else {
            final String className = args[0];
            final String methodName = args[1];

            final Class<?> clazz = Class.forName(className);
            final Method method = clazz.getDeclaredMethod(methodName);
            final Object result = method.invoke(null);

            System.out.println(result);
        }
    }
}
