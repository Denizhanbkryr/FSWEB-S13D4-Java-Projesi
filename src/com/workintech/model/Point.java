package com.workintech.model;

public class Point {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter ve Setter Metodları
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

    // Uzaklık Hesaplama Metodları
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        int xDifference = p.getX() - this.x;
        int yDifference = p.getY() - this.y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }

    public double distance(int a, int b) {
        int xDifference = a - this.x;
        int yDifference = b - this.y;
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }
}
