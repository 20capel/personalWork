package strings;

public class CircleClass
{
    private double radius;
    
    public CircleClass()
    {
	radius = 10;
    }
    public CircleClass(double r)
    {
         radius = r;
    }
    public double getRadius()
    {
	return radius;
    }
    public void setRadius(double r)
    {
	radius = r;
    }
    public double perimeter()
    {
        return (2.0*Math.PI*radius);
    }
    public double area()
    {
        return (Math.PI*(radius*radius));
    }
    
}