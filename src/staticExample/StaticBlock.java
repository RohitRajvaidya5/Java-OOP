package staticExample;

public class StaticBlock {

    static int a = 5;
    static int b = 2;


    static{
        System.out.println("static block executed");
        b = a * 5;
    }

    public static void main(String[] args) {

    }
}


