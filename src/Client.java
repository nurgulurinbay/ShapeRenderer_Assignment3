import abstraction.Circle;
import abstraction.Shape;
import abstraction.Square;
import implementor.RasterRenderer;
import implementor.Renderer;
import implementor.VectorRenderer;

public class Client {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(5, vectorRenderer);
        circle.draw();

        Shape square = new Square(10, rasterRenderer);
        square.draw();

        System.out.println("\nSwitching renderer:");

        Shape anotherCircle = new Circle(7, rasterRenderer);
        anotherCircle.draw();

        Shape anotherSquare = new Square(8, vectorRenderer);
        anotherSquare.draw();
    }
}
