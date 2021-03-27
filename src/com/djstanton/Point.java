package com.djstanton;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //* Method named distance without any parameters, it needs to return the distance between this Point
    // and Point 0,0 as double.
    public double distance() {
        Point a = new Point(0,0);

        return distance(a);
    }

    //* Method named distance with two parameters x, y both of type int, it needs to return the distance
    // between this Point and Point x,y as double.
    public double distance(int x, int y) {
        Point a = new Point(x,y);

        return distance(a);
    }


    //* Method named distance with parameter another of type Point, it needs to return the distance
    // between this Point and another Point as double.
    public double distance(Point another) {
        // formula for distance between point a and point b:
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        // where B = this point and A = another point
        return Math.sqrt( (this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y) );
    }


}
