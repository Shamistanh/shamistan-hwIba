package warmUP;

import java.util.ArrayList;

public class FigureApp {



    public static Figure newFig(){

        switch ((int)(Math.random()*3)){
            case 0: return  Rectangle.rand();
            case 1: return  Circle.rand();
            case 2:
            default: return  Triangle.rand();

        }
    }
    public static void main(String[] args) {
        Triangle tr = new Triangle(new Point(6,1), new Point(2,3), new Point(4,5));
        Rectangle rt = new Rectangle(new Point(2,6), new Point(9,3));
        Circle cr = new Circle(new Point(3,1),8);



        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(newFig());

        int total = 0;
        for (Figure f: figures) {
            total += f.area();
        }
        System.out.printf("The total area is %d\n", total);
    }
}
