import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        radius = in.nextInt();
        Circle circle = new Circle(radius);
        System.out.println("Square: " + circle.getSquare());
        System.out.println("Length: " + circle.getLength());
        Human man = new Human("White");
        System.out.println("Man's skin color: " + man.getSkinColor());
        Human.Hand hand = new Human.Hand(4);
        System.out.println("Number of fingers: " + hand.getFinger());
        Human.Head head = new Human.Head("Black");
        System.out.println("Hair color: " + head.getHairColor());
        Human.Leg leg = new Human.Leg(45);
        System.out.println("Foot size: " + leg.getLegSize());
}
}
