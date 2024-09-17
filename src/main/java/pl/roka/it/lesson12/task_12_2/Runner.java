package pl.roka.it.lesson12.task_12_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Написать программу, которая будет анализировать присутствие аннотации над классом MyService
 * и если она присутствует - создавать экземпляр этого класса, задавать значения его полям и
 * вызывать метод thisClassInfo (использовать возможности пакета reflection).
 */
public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<MyService> myServiceClass = MyService.class;

        if (myServiceClass.isAnnotationPresent(Version.class)){
            MyService myService = myServiceClass.getDeclaredConstructor().newInstance();
            Version version = myServiceClass.getAnnotation(Version.class);

            myService.setVersionOfMyService(version.versionOfMyService());
            myService.setCodeName(version.codeName());

            Method method = myServiceClass.getDeclaredMethod("thisClassInfo");

            if(!method.canAccess(myService)){
                method.setAccessible(true);
            }
            method.invoke(myService);
        }
    }
}
