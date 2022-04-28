package Chapter04.Part04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("Chapter04.Part04.Person");

        Person person = (Person) c1.newInstance();
        person.setName("Lee");

        System.out.println(person);

        // 인스턴스가 있는상태에서 getClass를 사용할 수 있음.
        Class c2 = person.getClass();
        Person p = (Person) c2.newInstance();
        System.out.println(p);

        Class[] parameterTypes ={String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person kimPerson = (Person) cons.newInstance(initargs);
        System.out.println(kimPerson);

        // 위의 코드와 같음

        Person kim2 = new Person("Kim");
    }
}
