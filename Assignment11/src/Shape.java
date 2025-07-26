abstract class Shape {
    public String type;

    public Shape(String type) {
        this.type = type;
    }
}

class Circle extends Shape{
    private float radius;

    public Circle(String type, float radius) {
        super(type);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "type=" + type + ", " +
                "radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle("circle", 5);

        System.out.println(circle);
    }
}
