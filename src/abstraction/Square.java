package abstraction;

import implementor.Renderer;

public class Square extends Shape {

    private double side;

    public Square(double side, Renderer renderer) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }
}