import java.text.DecimalFormat;

public class Cone {
    private double radius;
    private double height;
    
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume() {
        return (1.0/3.0) * Math.PI * this.radius * this.radius * this.height;
    }
    
    public double slantHeight() {
        double r2 = this.radius * this.radius;
        double h2 = this.height * this.height;
        
        return Math.sqrt(r2 + h2);
    }
    
    public double surfaceArea() {
        double circleArea = Math.PI * this.radius * this.radius;
        double coneSA = Math.PI * this.radius * slantHeight();
        
        return circleArea + coneSA;
    }
    
    public String toString() {
        String pattern = "0.000";
        DecimalFormat fmt = new DecimalFormat(pattern);
        
        return "The volume of this cone is: " + fmt.format(volume()) + " and the surface area is: " + fmt.format(surfaceArea())
            + ", and the slant height is: " + fmt.format(slantHeight());
    }
}
