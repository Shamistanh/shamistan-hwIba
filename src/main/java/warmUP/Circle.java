package warmUP;

public class Circle extends Figure {
    Point center;
    int radius;
    public Circle(Point center, int radius){
        this.center=center;
        this.radius=radius;


    }
    @Override
    public void area()
    {
        System.out.println((3.14)*radius*radius);
    }
}
