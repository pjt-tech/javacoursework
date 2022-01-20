package chapter4.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("chapter4.ch04.Person");
        Person person = (Person) c1.newInstance();
        person.setName("Park");
        System.out.println(person);

        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println("p = " + p);

        Class[] parameterTypes = {String.class};
        Constructor constructor = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Park"};
        Person parkPerson = (Person) constructor.newInstance(initargs);
        System.out.println(parkPerson);

    }
}
