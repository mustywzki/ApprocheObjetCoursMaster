package fr.ubordeaux.ao;

public class Ellipse extends Shape {
    int radiusX;
    int radiusY;
    
    public Ellipse(int cx, int cy, int rx, int ry){
        super(cx,cy);
        this.radiusX = rx;
        this.radiusY = ry;
    }

    public String toSVG(){
        return "<ellipse cx=\"" + this.x + "\" cy=\"" + this.y + "\" rx=\"" + this.radiusX + "\" ry=\"" + this.radiusY + "\" />\n";
    }
}