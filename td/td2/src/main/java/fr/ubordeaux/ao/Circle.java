package fr.ubordeaux.ao;

public class Circle extends Shape {
    int radius;

    public Circle(int cx, int cy, int r){
        super(cx,cy);
        this.radius = r;
    }

    public String toSVG(){
        return "<circle cx=\"" + this.x + "\" cy=\"" + this.y + "\" r=\"" + this.radius + "\" />\n";
    }
}