package src.main.java.core.module_8;

public enum ShapeType {
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    SQUARE("Square"),
    TRIANGLE("Triangle"),
    OVAL("Oval");

    private String shapeName;

    private ShapeType(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return shapeName;
    }
}
