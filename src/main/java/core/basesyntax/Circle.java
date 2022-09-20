package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle,"
                + " area: " + getArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor();
    }
}