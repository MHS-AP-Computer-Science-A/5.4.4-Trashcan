public class TrashcanTester {
public static void main(String[] args) {
    double remaining;

    TrashCan kitchen = new TrashCan(10.0);

    remaining = kitchen.acceptTrash(2.5);
    System.out.println(remaining);

    remaining = kitchen.acceptTrash(3.5);
    System.out.println(remaining);

    remaining = kitchen.acceptTrash(6.0);
    System.out.println(remaining);

    TrashCan bedroom = new TrashCan(3.0);

    remaining = bedroom.acceptTrash(1.0);
    System.out.println(remaining);

    remaining = bedroom.acceptTrash(3.2);
    System.out.println(remaining);
}
}
