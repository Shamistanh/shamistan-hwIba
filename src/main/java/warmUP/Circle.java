package warmUP;

public class Circle extends Figure {
    Point center;
    int radius;
    public Circle(Point center, int radius){
        this.center=center;
        this.radius=radius;


    }

    public static Circle rand(){
        Point r1=new Point((int)(Math.random()*10+5),(int)(Math.random()*10+5));
        int RandRad=(int)(Math.random()*10+5);
        return new Circle(r1,RandRad);
    }
    @Override
    public int area()
    {
        return (int)(Math.PI*radius*radius);
    }
}
