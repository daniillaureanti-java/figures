package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private final Point A;
    private Point X;
    private final double radius;

    public Circle(Point A, double radius) {
        this.A = A;
        this.radius = radius;
    }

    @Override
    public double area() {
        return (double) (Math.PI * (radius*radius));
    }
    @Override
    public String pointsToString() {
        return "("+A.getX()+","+A.getY()+")";
    }
    @Override
    public String toString() {
        return "Circle[("+A.getX()+","+A.getY()+")"+radius+"]";
    }
    @Override
    public Point leftmostPoint() {
        Point X= new Point(A.getX()-radius, A.getY());
        return X;
    }
}
