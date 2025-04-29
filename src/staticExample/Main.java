package staticExample;

public class Main {
    public static void main(String[] args) {
        Human rohit = new Human(26, "Rohit", 300000, false);
        Human anjali = new Human(24, "Anjali", 450000, true);
        Human vikram = new Human(30, "Vikram", 550000, false);
        Human sneha = new Human(28, "Sneha", 400000, true);
        Human arjun = new Human(27, "Arjun", 600000, false);
        Human priya = new Human(25, "Priya", 480000, true);

        System.out.println(Human.population);


    }
}
