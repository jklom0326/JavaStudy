package Chapter04.Part04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {

        // 리플렉션 프로그래밍 .. invoke할때만 쓴다

        Class c = Class.forName("java.lang.String");
        Constructor[] cons =  c.getConstructors();
        for (Constructor co : cons) {
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for (Method mth : m ){
            System.out.println(mth);
        }
    }
}
