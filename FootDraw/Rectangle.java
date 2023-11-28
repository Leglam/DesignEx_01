public class Rectangle extends FootShape {
    public void drawAsRectangle() {
        System.out.println("Drawing a Rectangle.");
    }

    @Override
    public void draw() {
        drawAsRectangle();
    }
}
