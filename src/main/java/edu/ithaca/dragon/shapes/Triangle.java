package edu.ithaca.dragon.shapes;

public class Triangle {
    private double sideLength;
    private double sideWidth;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Triangle(double sideLength, double sideWidth){
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    /**
     * @return the area of this circle
     */
    public double calcArea(){
        double TriArea = sideLength * sideWidth / 2;
        return TriArea;
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        double doubleSizeIn = sideLength * 2;
        sideLength = doubleSizeIn;
        doubleSizeIn = sideWidth * 2;
        sideWidth = doubleSizeIn;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        double longestLineWithinIn = Math.sqrt((sideLength * sideLength) + (sideWidth * sideWidth));
        return longestLineWithinIn;
    }
}

