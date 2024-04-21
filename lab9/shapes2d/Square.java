package shapes2d;

public class Square
{

protected double edge;

public Square(double edge)
    {
    this.edge = edge;
    }


public double AreaOfSquare()
    {
    return edge*edge;
    }
    public String toString()
    {
        return "Square's edge = " + edge + " and area = " + AreaOfSquare();
    }
}
