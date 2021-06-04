package lab.pkg1.task;

public class Rectangle extends Shape {
    private double length_,width_;
    
    Rectangle(double length, double width, int color)
    {
        super(color);
        length_ = length;
        width_ = width;
    }
    
    @Override
    public double getArea()
    {
        return (length_ * width_);
    }
    
    @Override
    public  String toString()
    {
        return ("Shape: Rectangle"+ "\nLength: " + length_ + "\nWidth: " + width_ +"\nArea: " + getArea());
    }
}
