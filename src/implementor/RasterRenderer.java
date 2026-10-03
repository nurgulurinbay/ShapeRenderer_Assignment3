package implementor;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing circle using Raster Renderer, radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing square using Raster Renderer, side: " + side);
    }
}
