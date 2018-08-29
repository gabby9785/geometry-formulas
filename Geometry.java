/**
 * Here are some useful Geometry formulas to demonstrate how functions can return values.
 * Also look at the Java Docs.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Geometry 
{
    /**
     * Calculates the area of a parallelogram.
     *
     * @param b  length of base of parallelogram
     * @param h  height of the parallelogram
     * @return   area of the parallelogram
     */
    public static double parallelogramArea(double base, double height) 
    {
        double area = base * height;
        
        return base * height;
    }
    
    /**
     * Calculates the area of a triangle.
     *
     * @param b  length of base of triangle
     * @param h  height of the triangle
     * @return   area of the triangle
     */
    public static double triangleArea(double base, double height) 
    {
        double area = base * height / 2.0;
        
        return area;
    }
    
    public static double sphereVolume(double radius) 
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public static double trapezoidArea(double base, double height)
    {
        double area = base + base / 2.0 * height;
        
        return area;
    }
    
    public static double rectangularprismVolume(double length, double width, double height)
    {
        double volume = width * height * length;
        
        return volume;
    }
    
    public static double coneVolume(double radius, double height)
    {
        double volume = Math.PI * Math.pow(radius, 2) * height / 3.0;
        
        return volume;
    }
    
    public static double rectangularprismSurfaceArea(double length, double width, double height)
    {
        double surfaceArea = 2 * ((width * length) + (height * length) + (height * width));
        
        return surfaceArea;
    }
    
    public static double sphereSurfaceArea(double radius)
    {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        return surfaceArea;
    }
    
    public static double getHypotenuse(double a, double b)
    {
        double c = Math.sqrt(Math.pow(a, 2) * Math.pow(b, 2));
        
        return c;
    }
    
    public static double getDistance(double x1, double y1, double x2, double y2)
    {
        double distance = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
        
        return distance;
    }
    
    public static double getSlope(double x1, double y1, double x2, double y2)
    {
        double slope = (y2 - y1) / (x2 - x1);
        
        return slope;
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        double ra1 = parallelogramArea(5.2, 9.3);
        System.out.println(ra1);
    }
}
