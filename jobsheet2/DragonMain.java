package jobsheet2;

public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("Dragon 1:");
        dragon1.printStatus();

        System.out.println();

        System.out.println("Dragon 2:");
        dragon2.printStatus();

        dragon1.move(5);

        dragon2.changeDirection(2);
        dragon2.move(3);

        System.out.println();
        System.out.println("Setelah bergerak:");

        System.out.println("Dragon 1:");
        dragon1.printStatus();

        System.out.println();

        System.out.println("Dragon 2:");
        dragon2.printStatus();
    }
}
