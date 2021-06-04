package lab.pkg1.task;

public class Circle extends Shape {
    private double radius_;
    protected static double PI = 3.14;
    
    Circle(double radius, int color)
    {
        super(color);
        radius_ = radius;
    }
    
    @Override
    public double getArea()
    {
        return (PI * radius_ * radius_);
    }
    
    @Override
    public  String toString()
    {
        return ("Shape: Circle" + "\nRadius: " + radius_ + "\nArea: " + getArea());
    }
    
}
