package warmUP;

public class Rectangle extends Figure {
    Point pt1;
    Point pt2;
public Rectangle(Point pt1, Point pt2)
{
    this.pt1=pt1;
    this.pt2=pt2;
}

    @Override
    public void area()
    {
        System.out.println(Math.abs(pt1.x-pt2.x)*Math.abs(pt1.y-pt2.y));
    }
}
