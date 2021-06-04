package lab.pkg1.task;

public class Square extends Shape {
    private double side_;
    
    Square(double side, int color)
    {
        super(color);
        side_ = side;
    }
    
    @Override
    public double getArea()
    {
        return (side_ * side_);
    }
    
    @Override
    public  String toString()
    {
        return ("Shape: Square" + "\nSide Length: " + side_ + "\nArea: " + getArea());
    }
    
}
