package implementor;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle using Vector Renderer, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square using Vector Renderer, side: " + side);
    }
}