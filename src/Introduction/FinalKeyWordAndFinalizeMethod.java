package Introduction;

// Demonstrating final keyword and finalize method
public class FinalKeyWordAndFinalizeMethod {
    public static void main(String[] args) {

        // Creating many objects to trigger garbage collection eventually
        for (long i = 0; i < 10_000_000; i++) {
            A newObj = new A("New Name");
        }
    }
}

// Class A demonstrating 'final' keyword and 'finalize' method
class A {

    // 'final' variable cannot be reassigned
    final int run = 10;

    String name;

    // Constructor to initialize name
    public A(String name) {
        this.name = name;
    }

    // finalize() is called by Garbage Collector before object destruction
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
