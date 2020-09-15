package fr.ubordeaux.ao;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        super(0,0);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        super(x,y);
    }

    public String toSVG(){
        return "<rect width=\"" + this.width + "\" height=\"" + this.height + "\" x=\"" + this.x + "\" y=\"" + this.y + "\" />\n";
    }

}