package fr.ubordeaux.ao;

import java.io.*;
import java.util.ArrayList;

public class SVG {
    private int width;
    private int height;
    private ArrayList<Shape> shapes;


    public SVG(int width, int height) {
        this.width = width;
        this.height = height;
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void createSVG(){
        try(FileWriter writer = new FileWriter("shapes.svg");
            BufferedWriter bw = new BufferedWriter(writer)) {

        bw.write("<svg width=\"" + this.width + "\" height=\"" + this.height + "\">\n");
        for ( Shape s : shapes){
            bw.write(s.toSVG());
            }
        bw.write("</svg>");
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}