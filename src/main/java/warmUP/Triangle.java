package warmUP;

public class Triangle extends Figure {
    Point pt1;
    Point pt2;
    Point pt3;
    public Triangle(Point pt1, Point pt2, Point pt3)
    {
        this.pt1=pt1;
        this.pt2=pt2;
        this.pt3=pt3;
    }
    @Override
    public void area()
    {
        double d1=Math.sqrt((pt2.x-pt1.x)*(pt2.x-pt1.x)+(pt2.y-pt1.y)*(pt2.y-pt1.y));
        double d2=Math.sqrt((pt3.x-pt1.x)*(pt3.x-pt1.x)+(pt3.y-pt1.y)*(pt3.y-pt1.y));
        double d3=Math.sqrt((pt3.x-pt2.x)*(pt3.x-pt2.x)+(pt3.y-pt2.y)*(pt3.y-pt2.y));
        double hp=(d1+d2+d3)/2;
        double a=Math.sqrt(hp*(hp-d1)*(hp-d2)*(hp-d3));
        System.out.println(a);
    }

}
