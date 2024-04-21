package shapes2d;

public class Circle
{

    protected double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double AreaOfCircle()
    {
        return radius*radius*Math.PI;
    }

    public String toString()
    {
        return "Circle's radius = " + radius + " area=" + AreaOfCircle();
    }

}
