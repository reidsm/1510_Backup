import java.text.DecimalFormat;

public class Cube {

    private double xCoord;
    private double yCoord;
    private double zCoord;
    private double edgeLength;
    
    public Cube(double xCoord, double yCoord, double zCoord, double edgeLength) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
        this.edgeLength = edgeLength;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public double surfaceArea() {
        return 6.0 * this.edgeLength * this.edgeLength;
    }
    
    public double faceDiagonal() {
        return Math.sqrt(2) * this.edgeLength;
    }
    
    public double volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public double spaceDiagonal() {
        return Math.sqrt(3) * this.edgeLength;
    }
    
    public String toString() {
        String pattern = "0.000";
        DecimalFormat fmt = new DecimalFormat(pattern);
        
        return "This cube's SA is " + fmt.format(surfaceArea()) + ", the volume is " + fmt.format(volume()) 
            + ", the face diagonal is " + fmt.format(faceDiagonal()) + ", and the space diagonal is "
            + fmt.format(spaceDiagonal());
    }
    
}
