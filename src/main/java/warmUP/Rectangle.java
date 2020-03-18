package warmUP;

public class Rectangle extends Figure {
    static Point pt1;
    static Point pt2;
public Rectangle(Point pt1, Point pt2)
{
    this.pt1=pt1;
    this.pt2=pt2;
}


    public static Rectangle rand(){

        return new Rectangle(pt1,pt2);
    }

    @Override
    public int area()
    {
        return (int)(Math.abs(pt1.x-pt2.x)*(pt1.y-pt2.y));
    }
}
