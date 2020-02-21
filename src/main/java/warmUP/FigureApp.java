package warmUP;

import java.util.ArrayList;

public class FigureApp {
    public static void main(String[] args) {
        Triangle tr=new Triangle(new Point(6,1), new Point(2,3),new Point(4,5));
        Rectangle rt= new Rectangle(new Point(2,6),new Point(9,3));
        Circle cr = new Circle(new Point(3,1),8);

        ArrayList<Figure> figures = new ArrayList<>();
     figures.add(tr);
     figures.add(rt);
     figures.add(cr);
        for (Figure f: figures)
            f.area();
    }
}
