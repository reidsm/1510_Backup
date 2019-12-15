import java.text.DecimalFormat;

public class Sphere {
    
    public final double PI = Math.PI;
    private int xCoord;
    private int yCoord;
    private int zCoord;
    private double radius;
    
    public Sphere(int xCoord, int yCoord, int zCoord, double radius) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
        this.radius = radius;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getzCoord() {
        return zCoord;
    }

    public void setzCoord(int zCoord) {
        this.zCoord = zCoord;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double surfaceArea() {
        return (4 * PI * this.radius * this.radius);
    }
    
    public double volume() {
        return ((4.0/3.0) * PI * this.radius * this.radius * this.radius);

    }
    
    public String toString() {
        String pattern = "0.000";
        DecimalFormat fmt = new DecimalFormat(pattern);
        
        return "The radius of this sphere is " + radius + ". The surface area of this sphere is "
                + fmt.format(surfaceArea()) + ". The volume of this sphere is " + fmt.format(volume());
                
    }
    
}
