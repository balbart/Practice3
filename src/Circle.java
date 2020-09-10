
public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getSquare(){
        return (Math.PI*radius*radius);
    }

    public double getLength(){
        return 2*Math.PI*radius;
    }
}
