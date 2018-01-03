package typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    void rotate(int degrees) {
        System.out.println("Rotating " + this + " by " + degrees + " degrees");
    }

    abstract public String toString();
}

class Circle extends Shape {

    public String toString() {
        return "Circle";
    }

    void rotate(int degrees) {
        throw new UnsupportedOperationException();
    }
}

class Square extends Shape {

    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    public String toString() {
        return "triangle";
    }
}

class Rhomboid extends Shape {

    public String toString() {
        return "rhomboid";
    }
}

public class Shapes {
    static void rotateAll(List<Shape> shapes) {
        for (Shape shape : shapes)
            if (!(shape instanceof Circle))
                shape.rotate(45);
    }

    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle(), new Rhomboid());

        rotateAll(shapeList);
        System.out.println("================");

        for (Shape shape : shapeList)
            shape.draw();

        Shape shape = new Rhomboid();
        Rhomboid r = (Rhomboid) shape;
//        Exception in thread "main" java.lang.ClassCastException: typeinfo.Rhomboid cannot be cast to typeinfo.Circle
//        Circle c = (Circle) shape;

        Circle c = null;
        if (shape instanceof Circle)
            c = (Circle) shape;
        else
            System.out.println("shape not a Circle");

    }
}
