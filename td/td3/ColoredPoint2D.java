import java.awt.Color;

public class ColoredPoint2D extends Point2D {
    Color color;

    public ColoredPoint2D(int x, int y, Color c){
        super(x,y);
        this.color = c;
    }
}