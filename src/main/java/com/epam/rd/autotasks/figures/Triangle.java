package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private Point A;
    private Point B;
    private Point C;
    private Point X;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    @Override
    public double area() {
        double AB = Math.sqrt(((B.getX() - A.getX()) * (B.getX() - A.getX())) + ((B.getY() - A.getY()) * (B.getY() - A.getY())));
        double BC = Math.sqrt(((C.getX() - B.getX()) * (C.getX() - B.getX())) + ((C.getY() - B.getY()) * (C.getY() - B.getY())));
        double AC = Math.sqrt(((C.getX() - A.getX()) * (C.getX() - A.getX())) + ((C.getY() - A.getY()) * (C.getY() - A.getY())));
        double semi_perimeter = (AB + BC + AC) / 2;
        return (double) (Math.sqrt(semi_perimeter * (semi_perimeter - AB) * (semi_perimeter - BC) * (semi_perimeter - AC)));

    }

    @Override
    public String pointsToString() {
        return "(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX() + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")";
    }

    @Override
    public String toString() {
        return "Triangle[" + "(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX() + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")" + "]";
    }

    @Override
    public Point leftmostPoint() {
        if ((A.getX() <= B.getX()) && (A.getX() <= C.getX())) {
            return X = new Point(A.getX(), A.getY());
        } else if((B.getX() <= A.getX()) && (B.getX() <= C.getX())){
            return X = new Point(B.getX(), B.getY());
        } else{
            return X = new Point(C.getX(), C.getY());
        }
    }
}
