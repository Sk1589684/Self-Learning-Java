package Assignments;

import java.lang.reflect.Method;

class Test {
    private void show() {
        System.out.println("Private method invoked");
    }
}

public class Q26 {
    public static void main(String[] args) throws Exception {
        Test obj = new Test();

        Method m = Test.class.getDeclaredMethod("show");
        m.setAccessible(true); // allow private access
        m.invoke(obj);
    }
}