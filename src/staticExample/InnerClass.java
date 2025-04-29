package staticExample;

public class InnerClass {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test("Test1");
        Test t2 = new Test("Test2");

        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t1);
    }
}
