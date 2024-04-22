public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Employee sam = new Employee("Sam");
        sam.display();
        System.out.println();

        Employee bob = new Employee("Bob", "Microsoft");
        bob.display();
        bob.work();
    }
}