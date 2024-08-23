public class MethodTest {

    static void testMethod(String testMessage) {
        System.out.println(testMessage);
    }
    static int sum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        testMethod("Test");

        int result = sum(100, 300);

        System.out.println(result);
    }
}