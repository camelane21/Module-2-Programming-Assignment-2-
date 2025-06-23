import java.util.Scanner;
import java.util.GregorianCalendar;

// Abstract superclass
abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    protected GeometricObject() {}

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
