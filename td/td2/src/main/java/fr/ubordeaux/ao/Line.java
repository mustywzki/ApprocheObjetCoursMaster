package fr.ubordeaux.ao;

public class Line extends Shape{
    int xEnd;
    int yEnd;

    public Line(int x, int y, int xEnd, int yEnd){
        super(x,y);
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    public String toSVG(){
        return "<line x1=\"" + this.x + "\" y1=\"" + this.y + "\" x2=\"" + this.xEnd + "\" y2=\"" + this.yEnd + "\" />\n";
    }
}