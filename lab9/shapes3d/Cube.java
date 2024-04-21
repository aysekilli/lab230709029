package shapes3d;

import shapes2d.Square;

public class Cube extends Square
{
    public Cube(double edge)
    {
        super(edge);
    }

    public double AreaOfCube()
    {
        return 6*super.AreaOfSquare();
    }

    public double VolumeOfCube()
    {
        return edge*edge*edge;
    }
    public String toString()
    {
        return "Area of cube = " + AreaOfCube() + " and volume = " + VolumeOfCube() ;
    }
}
