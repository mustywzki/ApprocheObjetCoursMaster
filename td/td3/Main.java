import java.awt.Color;

class Main {
    public static void main (String[] args){

        Point2D pt = new Point2D(5,50);
        ColoredPoint2D ptc = new ColoredPoint2D(50,130,Color.GREEN);

        String[] unsorted = {"chien", "mayonnaise", "ketchup", "prezident", "blablablablablabla"};
        InsertTri sorter = new InsertTri();
        String[] sorted = sorter.sort(unsorted);

        for (int i=0; i < sorted.length; i++)
        {
            System.out.println(sorted[i] + ", ");
        }

        System.out.println("///////////////////////////////////////////////");

        SortBenchmark benchmark = new SortBenchmark();

        benchmark.addAlgorithm(sorter);
        benchmark.addAlgorithm(new BubbleSort());

        benchmark.bench();

        
    }
}