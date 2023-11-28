import java.util.Scanner;

public class Foot {
    private FootShape footShape;

    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public void draw() {
        footShape.draw();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What to draw? 1. Eclipse 2. Rectangle");
        int choice = scanner.nextInt();

        FootShape footShape;

        switch (choice) {
            case 1:
                footShape = new Eclipse();
                break;
            case 2:
                footShape = new Rectangle();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        Foot foot = new Foot(footShape);
        foot.draw();
    }
}
