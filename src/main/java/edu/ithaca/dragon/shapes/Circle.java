package edu.ithaca.dragon.shapes;

public class Circle {
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double CircArea = 3.1415 * radius * radius;
        return CircArea;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double doubleSizeIn = radius * 2;
        radius = doubleSizeIn;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double longestLineWithinIn = radius * 2;
        return longestLineWithinIn;
    }

    /**
     * @return the radius
     */
    public double getRadius(){
        return radius;
    }
}
