package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    private Point X ;
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        A = a;
        B = b;
        C = c;
        D = d;
    }

    @Override
    public double area() {
        //поменять решение площади, проблемма здесь!!!
        double AB = Math.sqrt(((B.getX() - A.getX()) * (B.getX() - A.getX())) + ((B.getY() - A.getY()) * (B.getY() - A.getY())));
        double BC = Math.sqrt(((C.getX() - B.getX()) * (C.getX() - B.getX())) + ((C.getY() - B.getY()) * (C.getY() - B.getY())));
        double CD = Math.sqrt(((D.getX() - C.getX()) * (D.getX() - C.getX())) + ((D.getY() - C.getY()) * (D.getY() - C.getY())));
        double AD = Math.sqrt(((A.getX() - D.getX()) * (A.getX() - D.getX())) + ((A.getY() - D.getY()) * (A.getY() - D.getY())));
        double BD = Math.sqrt(((D.getX() - B.getX()) * (D.getX() - B.getX())) + ((D.getY() - B.getY()) * (D.getY() - B.getY())));
        double semi_perimeter1 = (AB + BD + AD) / 2;
        double Triangle1 = Math.sqrt(semi_perimeter1 * (semi_perimeter1 - AB) * (semi_perimeter1 - BD) * (semi_perimeter1 - AD));
        double semi_perimeter2 = (BC + BD + CD) / 2;
        double Triangle2 = Math.sqrt(semi_perimeter2 * (semi_perimeter2 - BC) * (semi_perimeter2 - BD) * (semi_perimeter2 - CD));
        return Triangle1+Triangle2;
    }

    @Override
    public String pointsToString() {
        return "(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX()  + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")" + "(" + D.getX() + "," + D.getY() + ")";
    }

    @Override
    public String toString() {
        return "Quadrilateral[(" + A.getX() + "," + A.getY() + ")" + "(" + B.getX() + "," + B.getY() + ")" + "(" + C.getX() + "," + C.getY() + ")"  + "(" + D.getX() + ","+ D.getY() + ")]";
    }

    @Override
    public Point leftmostPoint() {
        if ((A.getX() <= B.getX()) && (A.getX() <= C.getX())&&(A.getX()<=D.getX())) {
            return X = new Point(A.getX(), A.getY());
        } else if((B.getX() <= A.getX()) && (B.getX() <= C.getX())&&(A.getX()<=D.getX())){
            return X = new Point(B.getX(), B.getY());
        } else if ((C.getX() <= A.getX()) && (C.getX() <= B.getX())&&(C.getX()<=D.getX())) {
            return X = new Point(C.getX(), C.getY());
        } else{
            return X = new Point(D.getX(), D.getY());
        }
    }
}
