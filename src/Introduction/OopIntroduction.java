package Introduction;

// Main class
public class OopIntroduction {
    public static void main(String[] args) {

        // Store roll numbers
        int[] rollNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Store names
        String[] names = {"John", "Jane", "Jack", "Bob"};

        // Store student data
        int[] roll = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] studentNames = {"John", "Jane", "Jack", "Bob"};
        float[] marks = {90, 88, 100, 94, 85, 84};

        // Creating a Student object using the default constructor
        Student rohit = new Student();

        System.out.println("Rohit's Data:");
        System.out.println("Roll No: " + rohit.rollNo);
        System.out.println("Name: " + rohit.name);
        System.out.println("Marks: " + rohit.marks);

        rohit.greet();

        // Changing Rohit's name
        rohit.changeName("John");
        System.out.println("Updated Name: " + rohit.name);

        // Creating a new Student object by copying Rohit's data
        Student random = new Student(rohit);

        System.out.println("\nRandom Student's Data (copied from Rohit):");
        System.out.println("Roll No: " + random.rollNo);
        System.out.println("Name: " + random.name);
        System.out.println("Marks: " + random.marks);

        // Creating another student using default constructor
        Student random2 = new Student();
        System.out.println("\nRandom2 Student's Roll No: " + random2.rollNo);
    }
}

// Student class
class Student {
    int rollNo;
    String name;
    float marks;

    // Parameterized constructor
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Default constructor
    Student() {
        this(17, "John", 89.46f); // calling parameterized constructor
    }

    // Copy constructor
    Student(Student other) {
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    // Method to greet
    void greet() {
        System.out.println("Hello, my name is " + name + ".");
    }

    // Method to change name
    void changeName(String newName) {
        this.name = newName;
    }
}
