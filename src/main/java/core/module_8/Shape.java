package src.main.java.core.module_8;

public abstract class Shape {
    private ShapeType shapeType;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public String getShapeName() {
        return shapeType.toString();
    }

    public void printShapeName() {
        System.out.println(shapeType.toString());
    }
}
