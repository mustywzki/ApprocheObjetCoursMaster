package fr.ubordeaux.ao;

class Main {
    public static void main (String[] args){

        SVG doc = new SVG(400,400);

        doc.addShape(new Line(10,20,160,280));
        doc.addShape(new Circle(150,200,90));
        doc.addShape(new Rectangle(200,305,100,80));

        doc.createSVG();

        
    }
}