package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle
{
    protected double height;
    public Cylinder(double height, double radius)
    {
        super(radius);
        this.height = height;
    }
    // Cylinder's Area is calculated as (heights2xPixRadius) + (2*pi*radius*Radius)//
    public double AreaOfCylinder()
    {
        return (height*2*(AreaOfCircle()/radius)) + (2*AreaOfCircle());
    }
    // Cylinder's volume is calculated with the formula CircleArea*Height //
    public double VolumeOfCylinder()
    {
        return height*AreaOfCircle();
    }
    public String toString()
    {
        return "Cylinder's Area is = " + AreaOfCylinder()
                + " volume is = " + VolumeOfCylinder();
    }
}

